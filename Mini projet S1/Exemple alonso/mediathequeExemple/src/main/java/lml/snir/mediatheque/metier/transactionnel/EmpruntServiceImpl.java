
package lml.snir.mediatheque.metier.transactionnel;

import java.util.Date;
import java.util.List;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.mediatheque.physique.data.EmpruntDataService;
import lml.snir.mediatheque.physique.data.PhysiqueDataFactory;

/**
 *
 * @author jupiter
 */
public class EmpruntServiceImpl implements EmpruntService {
    private final EmpruntDataService empruntDataService;
    
    public EmpruntServiceImpl() throws Exception {
        this.empruntDataService = PhysiqueDataFactory.getEmpruntDataService();
    }

    @Override
    public Emprunt getByLivre(Livre livre) throws Exception {
        return this.empruntDataService.getByLivre(livre);
    }

    @Override
    public List<Emprunt> getByAdherent(Adherent adherent) throws Exception {
        return this.empruntDataService.getByAdherent(adherent);
    }

    @Override
    public List<Emprunt> getByDate(Date date) throws Exception {
        return this.empruntDataService.getByDate(date);
    }

    @Override
    public Emprunt add(Emprunt emprunt) throws Exception {
        // check si max 3 emprunt respecte
        int count = this.empruntDataService.getCountByAdherent(emprunt.getAdherent());
        if (count == 3) {
            throw new Exception("Désolé le nombre maximun d'emprunt est atteint !");
        }
        
        // check si pas deux fois meme livre
        List<Emprunt> emprunts = this.empruntDataService.getByAdherent(emprunt.getAdherent());
        for (Emprunt e : emprunts) {
            if (e.getLivre().equals(emprunt.getLivre())) {
                throw new Exception("Désolé on ne peut pas emprunter deux livres identiques en même temps !");
            }
        }
        
        // check si livre dispo
        if (!emprunt.getLivre().isDisponibilite()) {
            throw new Exception("Désolé livre non disponible !");
        }
        
        // tout ok marquer lmivre non dispo et ajouter emprunt dans bdd
        Livre l = emprunt.getLivre();
        l.setDisponibilite(false);
        
        PhysiqueDataFactory.getLivreDataService().update(l);
        
        return this.empruntDataService.add(emprunt);
    }

    @Override
    public void remove(Emprunt emprunt) throws Exception {
        Livre l = emprunt.getLivre();
        l.setDisponibilite(true);
        
        PhysiqueDataFactory.getLivreDataService().update(l);
        this.empruntDataService.remove(emprunt);
    }

    @Override
    public void update(Emprunt t) throws Exception {
         throw new Exception("Désolé modification d'emprunt impossible !");
    }

    @Override
    public Emprunt getById(Long id) throws Exception {
        return this.empruntDataService.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.empruntDataService.getCount();
    }

    @Override
    public List<Emprunt> getAll() throws Exception {
        return this.empruntDataService.getAll();
    }

    @Override
    public List<Emprunt> getAll(int begin, int count) throws Exception {
        return this.empruntDataService.getAll(begin, count);
    }

   
}
