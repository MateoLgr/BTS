package lml.snir.mediatheque.metier.entity;

import java.util.Date;

public class Emprunt {

    private Livre livre;
    private Adherent adherent;
    private long id;
    private Date dateEmprunt;

    public Emprunt() {   
        // pour la lib JDBC NE PAS UTILISER
    }
    
    public Emprunt(Livre livre, Adherent adherent) {
        this.adherent = adherent;
        this.livre = livre;
        this.dateEmprunt = new Date();
    }

    public long getId() {
        return id;
    }

    public Livre getLivre() {
        return livre;
    }

    public Adherent getAdherent() {
        return this.adherent;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    @Override
    public String toString() {
        return this.livre + " emprunter par " + this.adherent + " le " + this.dateEmprunt;
    }

    public void setDate(Date date) {
        this.dateEmprunt = date;
    }

    public void setId(long id) {
        this.id = id;
    }

}
