package lml.snir.mediatheque.client.livre;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lml.snir.javafx.AddEditDialog;
import lml.snir.javafx.AddEditDlgControllable;
import lml.snir.javafx.LMLModel;
import lml.snir.mediatheque.metier.entity.Livre;

/**
 *
 * @author fanou
 */
public class AddEditLivreController extends AddEditDialog<Livre> implements AddEditDlgControllable {

    @FXML
    private TextField textFieldTitre;
    @FXML
    private TextField textFieldAuteur;
    @FXML
    private CheckBox checkBoxDispo;
    private long id;

    private boolean okClicked = false;
    private Stage dialogStage;

    @FXML
    private void onButtonOKClick() {
        if (isInputValid()) {

            Livre p;
            String titre = this.textFieldTitre.getText();
            String auteur = this.textFieldAuteur.getText();
            boolean dispo = this.checkBoxDispo.isSelected();
            p = new Livre(auteur, titre);
            p.setDisponibilite(dispo);

            super.data = p;
            if (this.id != -1) {
                super.data.setId(this.id);
            }
            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void onButtonCancelClick() {
        dialogStage.close();
    }

    @Override
    public void setModelData(LMLModel model) {
        LivreModel pm = (LivreModel) model;
        super.data = pm.getAsObject();

        this.textFieldTitre.setText(super.data.getTitre());
        this.textFieldAuteur.setText(super.data.getAuteur());
        this.checkBoxDispo.setSelected(super.data.isDisponibilite());
        this.id = pm.getId();
    }

    @Override
    public LMLModel getModelData() {
        LivreModel model = new LivreModel();
        model.setObjectModel(super.data);
        return model;
    }

    @Override
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @Override
    public boolean isOkClicked() {
        return this.okClicked;
    }

    private boolean isInputValid() {
        return true;
    }

}
