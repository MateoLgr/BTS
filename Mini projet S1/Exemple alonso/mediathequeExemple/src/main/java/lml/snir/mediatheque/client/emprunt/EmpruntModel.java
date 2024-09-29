package lml.snir.mediatheque.client.emprunt;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import lml.snir.javafx.LMLModel;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Emprunt;

/**
 *
 * @author fanou
 */
public class EmpruntModel extends LMLModel<Emprunt> {
    private long id;
    private String adherent;
    private String livre; 
    private String date;

    @Override
    public void setObjectModel(Emprunt t) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.id = t.getId();
        this.adherent = t.getAdherent().toString();
        this.livre = t.getLivre().toString();
        this.date = sdf.format(t.getDateEmprunt());
    }

    @Override
    public Emprunt getAsObject() {
        try {
            return MetierFactory.getEmpruntService().getById(this.getId());
        } catch (Exception ex) {
            Logger.getLogger(EmpruntModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the adherent
     */
    public String getAdherent() {
        return adherent;
    }

    /**
     * @return the livre
     */
    public String getLivre() {
        return livre;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
    
}
