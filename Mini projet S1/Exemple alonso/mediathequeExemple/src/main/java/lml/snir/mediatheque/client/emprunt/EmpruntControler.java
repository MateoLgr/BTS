package lml.snir.mediatheque.client.emprunt;

import java.util.Date;
import javafx.beans.Observable;
import javafx.scene.control.TableView;
import lml.snir.javafx.LMLController;
import lml.snir.mediatheque.client.MainControler;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.mediatheque.metier.transactionnel.EmpruntService;

/**
 *
 * @author fanou
 */
public class EmpruntControler extends LMLController {

    private EmpruntService empruntSrv;
    private EmpruntModel empruntSelected;
    private final TableView<EmpruntModel> table;
    private int index;
    private EmpruntTableModel etm;

    public EmpruntControler(TableView table) {
        this.table = table;
    }

    @Override
    public void init() throws Exception {
        // to do init here
        this.empruntSrv = MetierFactory.getEmpruntService();
        this.etm = new EmpruntTableModel(this.table);
        this.etm.setNbPerPage(5);
        this.etm.setPagination(this.pagination);
        this.etm.init();
    }

    @Override
    public void add() throws Exception {
        Livre l = MainControler.getInstance().getLivreSelected();
        Adherent adh = MainControler.getInstance().getAdherentSelected();
        if (l == null) {
            throw new Exception("Il faut sélectionner un livre");
        }

        if (adh == null) {
            throw new Exception("Il faut sélectionner un adherent");
        }

        Emprunt emprunt = new Emprunt(l, adh);
        emprunt.setDate(new Date());
        this.empruntSrv.add(emprunt);
        this.refresh();
    }

    @Override
    public void update() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() throws Exception {
        Emprunt e = MainControler.getInstance().getEmpruntSelected();
        if (e == null) {
            throw new Exception(("Aucun emprunt de selectionné !"));
        }
        
        this.empruntSrv.remove(e);
        this.refresh();
        MainControler.getInstance().setLivreSelected(null);
    }

    @Override
    public void search(Object criteria) throws Exception {
        Adherent adh = MainControler.getInstance().getAdherentSelected();
        if (adh == null) {
            throw new Exception("Aucun adherent de selectionné !");
        }
        
        this.etm.findByNom(adh);   
        this.table.refresh();
    }

    @Override
    public void invalidated(Observable o) {
        this.empruntSelected = table.getSelectionModel().getSelectedItem();
        this.index = table.getSelectionModel().getSelectedIndex();

        if (this.empruntSelected != null) {
            MainControler.getInstance().setEmpruntSelected(this.empruntSelected.getAsObject());
        }
    }

    
    public void refresh() {
        this.etm.createPage(this.pagination.getCurrentPageIndex());
        this.table.refresh();
    }
}
