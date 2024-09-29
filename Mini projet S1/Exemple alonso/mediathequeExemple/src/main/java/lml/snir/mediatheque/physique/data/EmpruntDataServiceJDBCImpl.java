package lml.snir.mediatheque.physique.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.persistence.jdbc.AbstractCrudServiceJDBC;

/**
 *
 * @author fanou
 * @param <T>
 */
public class EmpruntDataServiceJDBCImpl<T> extends AbstractCrudServiceJDBC<Emprunt> implements EmpruntDataService {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public EmpruntDataServiceJDBCImpl() throws Exception {
        String query = null;
        try {
            switch (super.getDBType()) {
                case SQLITE:
                    query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                            + "  `id` INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                            + "  `date` varchar(16) NOT NULL,\n"  // Adherent ou Bibliothecaire
                            + "  `idLivre` INTEGER NOT NULL UNIQUE,\n"
                            + "  `idAdherent` INTEGER NOT NULL\n"
                            + ");";
                    break;
            }
            super.executeQuery(query);            
            
        } catch (Exception ex) {
            System.out.println(this.getClass().getSimpleName() + "\n"  + super.getDBType() + "\n" + ex);
        }
    }

    @Override
    protected Emprunt createEntity(Map map) throws Exception {
        Emprunt emprunt = null;
        
        long id = (int) map.get("id");
        String dateStr = (String) map.get("date");
        long idLivre = (int) map.get("idLivre");
        long idAdherent = (int) map.get("idAdherent");
        
        Livre livre = PhysiqueDataFactory.getLivreDataService().getById(idLivre);
        Adherent adherent = PhysiqueDataFactory.getAdherentDataService().getById(idAdherent);
        Date date = this.sdf.parse(dateStr);
        
        emprunt = new Emprunt(livre, adherent);
        emprunt.setDate(date);
        emprunt.setId(id);
        
        return emprunt;
    }

    @Override
    public Emprunt add(Emprunt emprunt) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (date, idLivre, idAdherent) VALUES ('"
                    + this.sdf.format(emprunt.getDateEmprunt()) + "','"
                    + emprunt.getLivre().getId() + "','"                    
                    + emprunt.getAdherent().getId() + "')";
        emprunt.setId(super.executeAdd(query));
        return emprunt;
    }

    @Override
    public void remove(Emprunt emprunt) throws Exception {
        super.remove(emprunt.getId());
    }

    @Override
    public void update(Emprunt emprunt) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET date = '"
                + this.sdf.format(emprunt.getDateEmprunt()) + "', idLivre = '"
                + emprunt.getLivre().getId() + "',  idAdherent = '"
                + emprunt.getAdherent().getId() + "' WHERE id = '" + emprunt.getId() + "'";

        super.executeQuery(query);
    }

    @Override
    public Emprunt getByLivre(Livre livre) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE idLivre = '" + livre.getId() + "'";
        return super.getSingleResult(query);
    }

    @Override
    public List<Emprunt> getByAdherent(Adherent adherent) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE idAdherent = '" + adherent.getId() + "'";
        return super.getResults(query);
    }

    @Override
    public List<Emprunt> getByDate(Date date) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE date = '" + this.sdf.format(date) + "'";
        return super.getResults(query);
    }

    @Override
    public int getCountByAdherent(Adherent adherent) throws Exception {
        String query = "SELECT COUNT(*) FROM " + super.getEntityName() + " WHERE idAdherent = '" + adherent.getId() + "'";
        return (int) super.getCount(query);
    }

//    @Override
//    public List<Emprunt> getByTitre(Livre livre) throws Exception {
//       // List<long> id = 
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
