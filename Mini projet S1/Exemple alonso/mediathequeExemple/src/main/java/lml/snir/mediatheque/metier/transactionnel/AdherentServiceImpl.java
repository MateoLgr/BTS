package lml.snir.mediatheque.metier.transactionnel;
import java.util.List;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.physique.data.AdherentDataService;
import lml.snir.mediatheque.physique.data.PhysiqueDataFactory;

/**
 *
 * @author jupiter
 */
public class AdherentServiceImpl implements AdherentService {
    private final AdherentDataService adherentDataService;
    
    public AdherentServiceImpl() throws Exception {
        adherentDataService = PhysiqueDataFactory.getAdherentDataService();
    }
    
    @Override
    public Adherent add(Adherent adherent) throws Exception {
        // if bibblio check login is ok
        if (adherent instanceof Bibliothecaire) {
            Bibliothecaire biblio = (Bibliothecaire) adherent;
            if (this.adherentDataService.getByLogin(biblio.getLogin()) != null) {
                throw new Exception("login déjà attribué !");
            }
            
            if (biblio.getMdp() == null | biblio.getMdp().length() < 5) {
                throw new Exception("Mot de passe trop court, min 6 charactères !");
            }
        }
       
        return this.adherentDataService.add(adherent);
    }

    @Override
    public void remove(Adherent adherent) throws Exception {
        // check
        List<Emprunt> emprunts = MetierFactory.getEmpruntService().getByAdherent(adherent);
        if (!emprunts.isEmpty()) {
            throw new Exception("Impossible de supprimer il y a " + emprunts.size() + " emprunt en cours pour " + adherent.toString());
        }
        
        this.adherentDataService.remove(adherent);
    }

    @Override
    public void update(Adherent adherent) throws Exception {
        // check
        
        this.adherentDataService.update(adherent);
    }

    @Override
    public Adherent getById(Long id) throws Exception {
        return this.adherentDataService.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.adherentDataService.getCount();
    }

    @Override
    public List<Adherent> getAll() throws Exception {
        return this.adherentDataService.getAll();
    }

    @Override
    public List<Adherent> getAll(int begin, int count) throws Exception {
        return this.adherentDataService.getAll(begin, count);
    }

    @Override
    public Bibliothecaire getByLogin(String login) throws Exception {
        return this.adherentDataService.getByLogin(login);
    }

    @Override
    public int getBibliothecaireCount() throws Exception {
        return this.adherentDataService.getBibliothecaireCount();
    }
    
    @Override
    public List<Adherent> getByNom(String nom)  throws Exception {
        return this.adherentDataService.getByNom(nom);
    }

    @Override
    public List<Adherent> getByPrenom(String prenom) throws Exception {
        return this.adherentDataService.getByPrenom(prenom);
    }

}
