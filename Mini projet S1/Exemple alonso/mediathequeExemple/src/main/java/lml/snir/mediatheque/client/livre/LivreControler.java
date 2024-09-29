package lml.snir.mediatheque.client.livre;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;
import javafx.beans.Observable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import lml.snir.javafx.LMLController;
import lml.snir.mediatheque.client.Main;
import lml.snir.mediatheque.client.MainControler;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.mediatheque.metier.transactionnel.LivreService;

/**
 *
 * @author fanou
 */
public class LivreControler extends LMLController {

    private LivreService livreSrv;
    private LivreModel livreSelected;
    private LivreTableModel ltm;
    private final TableView<LivreModel> table;
    private int index;

    public LivreControler(TableView table) {
        this.table = table;
    }

    @Override
    public void init() throws Exception {
        // to do init here
        this.ltm = new LivreTableModel(this.table);
        this.ltm.setNbPerPage(5);
        this.ltm.setPagination(this.pagination);
        this.ltm.init();

        this.livreSrv = MetierFactory.getLivreService();
    }

    @Override
    public void add() throws Exception {
        AddEditLivreController addEditDlg = new AddEditLivreController();
        addEditDlg.createDialogAddEdit(null, Main.class, "/lml/snir/mediatheque/client/AddEditLivreView.fxml", Main.primaryStage);
        Livre p = addEditDlg.getData();
        if (p != null) {
            this.livreSrv.add(p);
            this.ltm.createPage(this.pagination.getCurrentPageIndex());
            this.table.refresh();
        }
    }

    @Override
    public void update() throws Exception {
        if (this.livreSelected == null) {
            throw new Exception("On ne peut editer que si on à selectionnée un Livre !");
        }

        AddEditLivreController addEditDlg = new AddEditLivreController();
        addEditDlg.createDialogAddEdit(this.livreSelected, Main.class, "/lml/snir/mediatheque/client/AddEditLivreView.fxml", Main.primaryStage);
        Livre p = addEditDlg.getData();
        if (p != null) {
            this.livreSrv.update(p);
            this.ltm.createPage(this.pagination.getCurrentPageIndex());
            this.table.refresh();
        }
    }

    @Override
    public void remove() throws Exception {
        if (this.livreSelected == null) {
            throw new Exception("Aucun livre de selectionné");
        }

        Alert dlg = new Alert(Alert.AlertType.CONFIRMATION);
        dlg.setTitle("Voulez-vous vraiment supprimer ? ");
        dlg.setContentText(this.livreSelected.getAsObject().toString());
        if (dlg.showAndWait().get() == ButtonType.OK) {
            this.livreSrv.remove(this.livreSelected.getAsObject());
            this.ltm.createPage(this.pagination.getCurrentPageIndex());
            this.table.refresh();
            MainControler.getInstance().setLivreSelected(null);
        }
    }

    @Override
    public void search(Object criteria) throws Exception {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Recherche");
        dialog.setHeaderText("par mots clés");
        dialog.setContentText("Quel mots :");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            StringTokenizer tokenizer = new StringTokenizer(result.get(), " ");
            List<String> mc = new ArrayList<>();
            while(tokenizer.hasMoreTokens()) {
                mc.add(tokenizer.nextToken());
            }
            this.ltm.findByMotCle(mc);
        }

    }

    @Override
    public void invalidated(Observable o) {
        this.livreSelected = table.getSelectionModel().getSelectedItem();
        this.index = table.getSelectionModel().getSelectedIndex();

        if (this.livreSelected != null) {
            MainControler.getInstance().setLivreSelected(this.livreSelected.getAsObject());
        }
    }

    public void refresh() {
        this.ltm.createPage(this.pagination.getCurrentPageIndex());
        this.table.refresh();
    }

}
