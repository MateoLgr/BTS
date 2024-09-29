package lml.snir.mediatheque.client.livre;

import java.util.List;
import javafx.scene.control.TableView;
import lml.snir.javafx.AbstractJFXTableModel;
import lml.snir.mediatheque.metier.MetierFactory;

/**
 *
 * @author fanou
 */
public class LivreTableModel extends AbstractJFXTableModel<LivreModel> {

    public LivreTableModel(TableView table) throws Exception {
        super(table, LivreModel.class);
        super.setService(MetierFactory.getLivreService());
    }

    public void findByMotCle(List<String> mc) throws Exception {
        List data = MetierFactory.getLivreService().getByMotsClefs(mc);
        super.update(data);
    }
    
}