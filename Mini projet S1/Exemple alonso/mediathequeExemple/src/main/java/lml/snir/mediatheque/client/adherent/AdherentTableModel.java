package lml.snir.mediatheque.client.adherent;

import java.util.List;
import javafx.scene.control.TableView;
import lml.snir.javafx.AbstractJFXTableModel;
import lml.snir.mediatheque.metier.MetierFactory;

/**
 *
 * @author fanou
 */
public class AdherentTableModel extends AbstractJFXTableModel<AdherentModel> {

    public AdherentTableModel(TableView table) throws Exception {
        super(table, AdherentModel.class);
        super.setService(MetierFactory.getAdherentService());
    }

    void findByNom(String nom) throws Exception {
        List data = MetierFactory.getAdherentService().getByNom(nom);
        super.update(data);
    }
    
}
