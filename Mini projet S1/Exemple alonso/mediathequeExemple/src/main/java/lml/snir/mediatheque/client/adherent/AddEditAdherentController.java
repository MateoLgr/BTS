package lml.snir.mediatheque.client.adherent;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lml.snir.javafx.AddEditDialog;
import lml.snir.javafx.AddEditDlgControllable;
import lml.snir.javafx.LMLModel;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;

/**
 *
 * @author fanou
 */
public class AddEditAdherentController extends AddEditDialog<Adherent> implements AddEditDlgControllable {

    private Stage dialogStage;

    private boolean okClicked = false;

    @FXML
    private TextField textFieldNom;
    @FXML
    private TextField textFieldPrenom;
    @FXML
    private TextField textFieldLogin;
    @FXML
    private PasswordField passwordFieldMdp;
    @FXML
    private CheckBox isAdmin;

    private long id = -1;

    @FXML
    private void buttonOkClick(Event event) throws Exception {
        if (isInputValid()) {

            Adherent p;
            String login = this.textFieldLogin.getText();
            String mdp = this.passwordFieldMdp.getText();
            String nom = this.textFieldNom.getText();
            String prenom = this.textFieldPrenom.getText();
            if (this.isAdmin.isSelected()) {
                Bibliothecaire a = new Bibliothecaire(nom, prenom, mdp, true, login);
                p = a;
            } else {
                p = new Adherent(nom, prenom);
            }

            super.data = p;
            if (this.id != -1) {
                super.data.setId(this.id);
            }
            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void buttonCancelClick(Event event) throws Exception {
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (this.textFieldNom.getText() == null || this.textFieldNom.getText().length() == 0) {
            errorMessage += "nom invallide!\n";
        }
        if (this.textFieldPrenom.getText() == null || this.textFieldPrenom.getText().length() == 0) {
            errorMessage += "prenom invalide!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }

    @Override
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @Override
    public boolean isOkClicked() {
        return this.okClicked;
    }

    @Override
    public void setModelData(LMLModel model) {
        AdherentModel pm = (AdherentModel) model;
        super.data = pm.getAsObject();
        if (super.data instanceof Bibliothecaire) {
            Bibliothecaire b = (Bibliothecaire) super.data;
            this.textFieldLogin.setText(b.getLogin());
            this.passwordFieldMdp.setText(b.getMdp());
        } 
        
        this.textFieldNom.setText(super.data.getNom());
        this.textFieldPrenom.setText(super.data.getPrenom());
        this.id = pm.getId();
    }

    @Override
    public LMLModel getModelData() {
        AdherentModel model = new AdherentModel();
        model.setObjectModel(super.data);
        return model;
    }

}
