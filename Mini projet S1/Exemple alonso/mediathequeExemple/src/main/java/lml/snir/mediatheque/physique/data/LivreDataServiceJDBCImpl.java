package lml.snir.mediatheque.physique.data;

import java.util.List;
import java.util.Map;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.persistence.jdbc.AbstractCrudServiceJDBC;

/**
 *
 * @author fanou
 * @param <T>
 */
public class LivreDataServiceJDBCImpl<T> extends AbstractCrudServiceJDBC<Livre> implements LivreDataService {
    
    public LivreDataServiceJDBCImpl() throws Exception {
        String query = null;
        try {
            switch (super.getDBType()) {
                case SQLITE:
                    query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                            + "  `id` INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                            + "  `auteur` varchar(16) NOT NULL,\n"  // Adherent ou Bibliothecaire
                            + "  `titre` varchar(16) NOT NULL,\n"
                            + "  `dispo` tinyint(1) NOT NULL\n"
                            + ");";
                    break;
            }
            super.executeQuery(query);            
            
        } catch (Exception ex) {
            System.out.println(this.getClass().getSimpleName() + "\n"  + super.getDBType() + "\n" + ex);
        }
    }

    @Override
    protected Livre createEntity(Map map) throws Exception {
        Livre livre = null;
        
        long id = (int) map.get("id");
        String auteur = (String) map.get("auteur");
        String titre = (String) map.get("titre");
        Object dispo = map.get("dispo");

        livre = new Livre(auteur, titre);
        livre.setId(id);
        if (dispo instanceof Boolean) {
            livre.setDisponibilite((Boolean) dispo);
        } else {
            livre.setDisponibilite((int)dispo == 1);
        }
        
        return livre;
    }

    @Override
    public Livre add(Livre livre) throws Exception {
        String dispo = "0";
        if (livre.isDisponibilite()) {
            dispo = "1";
        }
        
        String query = "INSERT INTO " + super.getEntityName() + " (auteur, titre, dispo) VALUES ('"
                    + livre.getAuteur() + "','"
                    + livre.getTitre() + "','"                    
                    + dispo + "')";
        livre.setId(super.executeAdd(query));
        return livre;
    }

    @Override
    public void remove(Livre livre) throws Exception {
        super.remove(livre.getId());
    }

    @Override
    public void update(Livre livre) throws Exception {
        String dispo = "0";
        if (livre.isDisponibilite()) {
            dispo = "1";
        }
        
        String query = "UPDATE " + super.getEntityName() + " SET auteur = '"
                + livre.getAuteur() + "', titre = '"
                + livre.getTitre() + "',  dispo = '"
                + dispo + "' WHERE id = '" + livre.getId() + "'";

        super.executeQuery(query);
    }

    @Override
    public List<Livre> getByAuteur(String auteur) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE auteur = '" + auteur + "'";
        return super.getResults(query);
    }

    @Override
    public List<Livre> getByTitre(String titre) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE titre = '" + titre + "'";
        return super.getResults(query);
    }

    @Override
    public List<Livre> getByTitreEtDispo(String titre, boolean disponible) throws Exception {
        String dispo = "0";
        if (disponible) {
            dispo = "1";
        }
        
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE titre = '" + titre + "' AND dispo = '" + dispo + "'";
        return super.getResults(query);
    }

    @Override
    public List<Livre> getByMotsClefs(List<String> motClefs) throws Exception {
        StringBuilder query = new StringBuilder("SELECT * FROM ").append(super.getEntityName()).append(" WHERE titre LIKE ");
        int index = 0;
        for (String mot : motClefs) {
            index++;
            query.append("'%"+mot+"%'");
            if (index < motClefs.size()) {
                query.append(" OR titre LIKE ");
            }
        }
        
        //SELECT * FROM Livres WHERE titre LIKE '%MONDE%' OR titre LIKE '%MEILLEURS%'
        System.out.println(query);
        return super.getResults(query.toString());
    }
    
}
