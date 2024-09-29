package lml.snir.mediatheque.metier.entity;

public class Adherent {

    private long id;
    private String nom;
    private String prenom;
    
    public Adherent() {
        // pour la lib JDBC NE PAS UTILISER
    }

    public Adherent(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return this.prenom + " " + this.nom;
    }

}
