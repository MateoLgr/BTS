package lml.snir.mediatheque.client.livre;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import lml.snir.javafx.LMLModel;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Livre;

/**
 *
 * @author fanou
 */
public class LivreModel extends LMLModel<Livre> {
    private long id;
    private String titre;
    private String auteur; 
    private boolean dispo;

    @Override
    public void setObjectModel(Livre t) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.id = t.getId();
        this.auteur = t.getAuteur();
        this.titre =t.getTitre();
        this.dispo = t.isDisponibilite();
    }

    @Override
    public Livre getAsObject() {
        try {
            return MetierFactory.getLivreService().getById(this.getId());
        } catch (Exception ex) {
            Logger.getLogger(LivreModel.class.getName()).log(Level.SEVERE, null, ex);
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
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @return the auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @return the dispo
     */
    public boolean isDispo() {
        return dispo;
    }

    
    
}
