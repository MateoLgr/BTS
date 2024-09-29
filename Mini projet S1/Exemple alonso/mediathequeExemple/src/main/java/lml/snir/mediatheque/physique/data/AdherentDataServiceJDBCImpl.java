package lml.snir.mediatheque.physique.data;

import java.util.List;
import java.util.Map;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;
import lml.snir.persistence.jdbc.AbstractCrudServiceJDBC;

/**
 *
 * @author fanou
 */
final class AdherentDataServiceJDBCImpl<T> extends AbstractCrudServiceJDBC<Adherent> implements AdherentDataService {

    public AdherentDataServiceJDBCImpl() throws Exception {
        String query = null;
        try {
            switch (super.getDBType()) {
                case SQLITE:
                    query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                            + "  `id` INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                            + "  `type` varchar(16) NOT NULL,\n" // Adherent ou Bibliothecaire
                            + "  `login` varchar(32) UNIQUE,\n"
                            + "  `mdp` varchar(32),\n"
                            + "  `nom` varchar(32) NOT NULL,\n"
                            + "  `prenom` varchar(32) NOT NULL\n"
                            + ");";
                    break;
            }
            super.executeQuery(query);

            // create default admin if need
            int count = this.getBibliothecaireCount();
            if (count == 0) {
                Bibliothecaire adm = new Bibliothecaire("admin", "admin", "admin", true, "admin");
                this.add(adm);
            }

        } catch (Exception ex) {
            System.out.println(this.getClass().getSimpleName() + "\n" + super.getDBType() + "\n" + ex);
        }
    }

    @Override
    public List<Adherent> getByNom(String nom) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE nom = '" + nom + "'";
        return super.getResults(query);
    }

    @Override
    public List<Adherent> getByPrenom(String prenom) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE prenom = '" + prenom + "'";
        return super.getResults(query);
    }

    @Override
    public Adherent add(Adherent adherent) throws Exception {
        String nom = adherent.getNom();
        String prenom = adherent.getPrenom();
        String login;
        String password;
        String discriminant = adherent.getClass().getSimpleName();
        String query;

        if (adherent instanceof Bibliothecaire) {
            Bibliothecaire b = (Bibliothecaire) adherent;
            login = b.getLogin();
            password = b.getMdp();

            query = "INSERT INTO " + super.getEntityName() + " (nom, prenom, login, mdp, type) VALUES ('"
                    // + personne.getId() + "','"
                    + nom + "','"
                    + prenom + "','"
                    + login + "','"
                    + password + "','"
                    + discriminant + "')";
        } else {
            query = "INSERT INTO " + super.getEntityName() + " (nom, prenom, type) VALUES ('"
                    // + personne.getId() + "','"
                    + nom + "','"
                    + prenom + "','"
                    + discriminant + "')";
        }

        adherent.setId(super.executeAdd(query));
        return adherent;
    }

    @Override
    public void remove(Adherent adherent) throws Exception {
        super.remove(adherent.getId());
    }

    @Override
    public void update(Adherent adherent) throws Exception {
        String nom = adherent.getNom();
        String prenom = adherent.getPrenom();
        String login;
        String password;
        String discriminant = adherent.getClass().getSimpleName();

        String query = "UPDATE " + super.getEntityName() + " SET nom = '"
                + nom + "', prenom = '"
                + prenom + "',  type = '"
                + discriminant + "' WHERE id = '" + adherent.getId() + "'";

        if (adherent instanceof Bibliothecaire) {
            Bibliothecaire b = (Bibliothecaire) adherent;
            login = b.getLogin();
            password = b.getMdp();
            
            query = "UPDATE " + super.getEntityName() + " SET nom = '"
                    + nom + "', prenom = '"
                    + prenom + "', login = '"
                    + login + "', mdp = '"
                    + password + "',  type = '"
                    + discriminant + "' WHERE id = '" + adherent.getId() + "'";
        }

        super.executeQuery(query);
    }

    @Override
    protected Adherent createEntity(Map map) throws Exception {
        Adherent adherent;

        int id = (int) map.get("id");
        String nom = (String) map.get("nom");
        String prenom = (String) map.get("prenom");
        String login = (String) map.get("login");
        String password = (String) map.get("mdp");
        String discriminant = (String) map.get("type");

        if ("Bibliothecaire".equals(discriminant)) {
            adherent = new Bibliothecaire(nom, prenom, password, false, login);
            Bibliothecaire a = (Bibliothecaire) adherent;
            a.setLogin(login);
            a.setEncodedMdp(password);
        } else {
            adherent = new Adherent(nom, prenom);
        }

        adherent.setId(id);

        return adherent;
    }

    @Override
    public Bibliothecaire getByLogin(String login) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE login = '" + login + "'";
        return (Bibliothecaire) super.getSingleResult(query);
    }

    @Override
    public int getBibliothecaireCount() throws Exception {
        String query = "SELECT COUNT(*) FROM " + super.getEntityName() + "  WHERE type = 'Bibliothecaire'";
        return (int) super.getCount(query);
    }

}
