package lml.snir.mediatheque.client.adherent;

import java.util.logging.Level;
import java.util.logging.Logger;
import lml.snir.javafx.LMLModel;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Adherent;

/**
 *
 * @author fanou
 */
public class AdherentModel extends LMLModel<Adherent> {

    private long id;
    private String nom;
    private String prenom;
    private String status;
    private int emprunt;

    @Override
    public void setObjectModel(Adherent t) {
        this.id = t.getId();
        this.nom = t.getNom();
        this.prenom = t.getPrenom();
        this.status = t.getClass().getSimpleName();
        try {
            this.emprunt = MetierFactory.getEmpruntService().getByAdherent(t).size();
        } catch (Exception ex) {

        }
    }

    @Override
    public Adherent getAsObject() {
        try {
            return MetierFactory.getAdherentService().getById(this.getId());
        } catch (Exception ex) {
            Logger.getLogger(AdherentModel.class.getName()).log(Level.SEVERE, null, ex);
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
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    
    public int getEmprunt() {
        return this.emprunt;
    }

}
