package lml.snir.mediatheque.metier.entity;

import java.util.Objects;

public class Livre {

    private long id;
    private String auteur;
    private String titre;
    private boolean disponibilite;

    public Livre() {
        // pour la lib JDBC NE PAS UTILISER
    }
            
    public Livre(String auteur, String titre) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponibilite = true;
        this.id = -1;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @return the disponnibilite
     */
    public boolean isDisponibilite() {
        return disponibilite;
    }

    /**
     * @param disponibilite the disponibilite to set
     */
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Livre && o.hashCode() == this.hashCode());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.auteur);
        hash = 73 * hash + Objects.hashCode(this.titre);
        return hash;
    }
    
    @Override
    public String toString() {
        return this.titre + " by " + this.auteur + " dispo : " + this.disponibilite;
    }
    
}
