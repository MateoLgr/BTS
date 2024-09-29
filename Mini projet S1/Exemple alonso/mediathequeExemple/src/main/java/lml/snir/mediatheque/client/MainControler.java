package lml.snir.mediatheque.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import lml.snir.mediatheque.client.adherent.AdherentControler;
import lml.snir.mediatheque.client.emprunt.EmpruntControler;
import lml.snir.mediatheque.client.livre.LivreControler;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.metier.entity.Livre;

/**
 *
 * @author fanou
 */
public class MainControler implements Initializable {

    private static MainControler instance;
    private Livre livreSelected;
    private Adherent adherentSelected;
    private Emprunt empruntSelected;
    
    private AdherentControler adherentControler;
    
    private EmpruntControler empruntControler;
    
    private LivreControler livreControler;
    
    @FXML
    private TableView<Livre> tableLivre;
    
    @FXML
    private Pagination paginationLivre;
    
    @FXML
    private TableView tableAdherent;
    
    @FXML
    private Pagination paginationAdherent;
    
    @FXML
    private TableView<Emprunt> tableEmprunt;
    
    @FXML
    private Pagination paginationEmprunt;
    
    @FXML    
    private Label labelAdherentSeleted;
    
    @FXML
    private Label labelLivreSeleted;
    
    private void initAdherent() throws Exception {
        this.adherentControler = new AdherentControler(tableAdherent);
        this.adherentControler.setPagination(this.paginationAdherent);
        this.tableAdherent.getSelectionModel().selectedItemProperty().addListener(this.adherentControler);
        this.adherentControler.init();
    }
    
    private void initEmprunt() throws Exception {
        this.empruntControler = new EmpruntControler(tableEmprunt);
        this.empruntControler.setPagination(this.paginationEmprunt);
        this.tableEmprunt.getSelectionModel().selectedItemProperty().addListener(this.empruntControler);
        this.empruntControler.init();
    }
    
    private void initLivre() throws Exception {
        this.livreControler = new LivreControler(tableLivre);
        this.livreControler.setPagination(this.paginationLivre);
        this.tableLivre.getSelectionModel().selectedItemProperty().addListener(this.livreControler);
        this.livreControler.init();
    }
    
    private void showErrorMessage(String err) {
        System.err.println(err);
        Alert dlgAlert = new Alert(Alert.AlertType.ERROR);
        dlgAlert.setTitle("Erreur");
        dlgAlert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
        dlgAlert.setContentText(err);
        dlgAlert.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MainControler.instance = this;
        try {
            this.initAdherent();
            this.initEmprunt();
            this.initLivre();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuAddAdherentClick() {
        try {
            this.adherentControler.add();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuAddLivreClick() {
        try {
            this.livreControler.add();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuAddEmpruntClick() {
        try {
            this.empruntControler.add();
            this.adherentControler.refresh();
            this.livreControler.refresh();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuEditAdherentClick() {
        try {
            this.adherentControler.update();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuEditLivreClick() {
        try {
            this.livreControler.update();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
     
    @FXML
    public void onMenuRemoveLivreClick() {
        try {
            this.livreControler.remove();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuRemoveEmpruntClick() {
        try {
            this.empruntControler.remove();
            this.adherentControler.refresh();
            this.livreControler.refresh();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuRemoveAdherentClick() {
        try {
            this.adherentControler.remove();
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuFindAdherentClick() {
        try {
            this.adherentControler.search(null);
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuFindLivreClick() {
        try {
            this.livreControler.search(null);
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuFindEmpruntClick() {
        try {
            this.empruntControler.search(null);
        } catch (Exception ex) {
            this.showErrorMessage(ex.getMessage());
        }
    }
    
    @FXML
    public void onMenuFileQuitClick() {
        System.out.println("quit");
        Platform.exit();
    }

    /**
     * @return the livreSelected
     */
    public Livre getLivreSelected() {
        return livreSelected;
    }

    /**
     * @param livreSelected the livreSelected to set
     */
    public void setLivreSelected(Livre livreSelected) {
        if (livreSelected != null) {
            this.labelLivreSeleted.setText(livreSelected.toString());
        } else {
            this.labelLivreSeleted.setText("");
        }
        this.livreSelected = livreSelected;
    }

    /**
     * @return the adherentSelected
     */
    public Adherent getAdherentSelected() {
        return adherentSelected;
    }

    /**
     * @param adherentSelected the adherentSelected to set
     */
    public void setAdherentSelected(Adherent adherentSelected) {
        if (adherentSelected != null) {
            this.labelAdherentSeleted.setText(adherentSelected.toString());
        } else {
            this.labelAdherentSeleted.setText("");
        }
        this.adherentSelected = adherentSelected;
    }

    /**
     * @return the empruntSelected
     */
    public Emprunt getEmpruntSelected() {
        return empruntSelected;
    }

    /**
     * @param empruntSelected the empruntSelected to set
     */
    public void setEmpruntSelected(Emprunt empruntSelected) {
        this.empruntSelected = empruntSelected;
    }

    /**
     * @return the instance
     */
    public static MainControler getInstance() {
        return instance;
    }
    
}
