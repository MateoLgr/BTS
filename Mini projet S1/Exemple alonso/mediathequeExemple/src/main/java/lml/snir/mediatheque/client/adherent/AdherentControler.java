package lml.snir.mediatheque.client.adherent;

import java.util.Optional;
import javafx.beans.Observable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import lml.snir.javafx.LMLController;
import lml.snir.mediatheque.client.Main;
import lml.snir.mediatheque.client.MainControler;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.transactionnel.AdherentService;

/**
 *
 * @author fanou
 */
public class AdherentControler extends LMLController {

    private AdherentService aderentSrv;
    private AdherentModel adherentSelected;
    private final TableView<AdherentModel> table;
    private int index;

    private AdherentTableModel atm;

    public AdherentControler(TableView table) {
        this.table = table;
    }

    @Override
    public void init() throws Exception {
        // to do init here
        this.atm = new AdherentTableModel(this.table);
        this.atm.setNbPerPage(5);
        this.atm.setPagination(this.pagination);
        this.atm.init();

        this.aderentSrv = MetierFactory.getAdherentService();
    }

    @Override
    public void add() throws Exception {
        AddEditAdherentController addEditDlg = new AddEditAdherentController();
        addEditDlg.createDialogAddEdit(null, Main.class, "/lml/snir/mediatheque/client/AddEditAdherentView.fxml", Main.primaryStage);
        Adherent p = addEditDlg.getData();
        if (p != null) {
            this.aderentSrv.add(p);            
            this.atm.createPage(this.pagination.getCurrentPageIndex());
            this.table.refresh();
        }
    }

    @Override
    public void update() throws Exception {
        if (this.adherentSelected == null) {
            throw new Exception("On ne peut editer que si on à selectionnée un Adhérent !");
        }
        
        AddEditAdherentController addEditDlg = new AddEditAdherentController();
        addEditDlg.createDialogAddEdit(this.adherentSelected, Main.class, "/lml/snir/mediatheque/client/AddEditAdherentView.fxml", Main.primaryStage);
        Adherent p = addEditDlg.getData();
        if (p != null) {
            this.aderentSrv.update(p);            
            this.atm.createPage(this.pagination.getCurrentPageIndex());
            this.table.refresh();
        }
    }

    @Override
    public void remove() throws Exception {
        if (this.adherentSelected == null) {
            throw new Exception("Aucun adherent de selectionné");
        }

        Alert dlg = new Alert(Alert.AlertType.CONFIRMATION);
        dlg.setTitle("Voulez-vous vraiment supprimer ? ");
        dlg.setContentText(this.adherentSelected.getNom() + " " + this.adherentSelected.getPrenom());
        if (dlg.showAndWait().get() == ButtonType.OK) {
            this.aderentSrv.remove(this.adherentSelected.getAsObject());
            this.atm.createPage(this.pagination.getCurrentPageIndex());
            this.table.refresh();
            MainControler.getInstance().setAdherentSelected(null);
        }
    }

    @Override
    public void search(Object criteria) throws Exception {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Recherche");
        dialog.setHeaderText("par nom");
        dialog.setContentText("Quel nom :");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            this.atm.findByNom(result.get());            
        }
    }

    @Override
    public void invalidated(Observable o) {
        this.adherentSelected = table.getSelectionModel().getSelectedItem();
        this.index = table.getSelectionModel().getSelectedIndex();

        if (this.adherentSelected != null) {
            MainControler.getInstance().setAdherentSelected(this.adherentSelected.getAsObject());
        }
    }
    
    public void refresh() {
        this.atm.createPage(this.pagination.getCurrentPageIndex());
        this.table.refresh();
    }

}
