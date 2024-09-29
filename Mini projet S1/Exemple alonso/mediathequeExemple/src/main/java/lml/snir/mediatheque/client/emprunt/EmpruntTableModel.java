package lml.snir.mediatheque.client.emprunt;

import java.util.List;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import lml.snir.javafx.AbstractJFXTableModel;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Adherent;

/**
 *
 * @author fanou
 */
public class EmpruntTableModel extends AbstractJFXTableModel<EmpruntModel> {

    public EmpruntTableModel(TableView table) throws Exception {
        super(table, EmpruntModel.class);
        super.setService(MetierFactory.getEmpruntService());
    }

    void findByNom(Adherent adh) throws Exception {
        List data = MetierFactory.getEmpruntService().getByAdherent(adh);
        if (data.isEmpty()) {
            Alert dlgAlert = new Alert(Alert.AlertType.INFORMATION);
            dlgAlert.setTitle("Information");
            dlgAlert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            dlgAlert.setContentText("aucun emprunt pour " + adh.toString());
            dlgAlert.showAndWait();
        }
        super.update(data);
    }

}
