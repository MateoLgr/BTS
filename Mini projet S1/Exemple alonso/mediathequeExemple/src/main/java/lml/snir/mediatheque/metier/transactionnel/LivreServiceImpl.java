package lml.snir.mediatheque.metier.transactionnel;

import lml.snir.mediatheque.metier.entity.Livre;
import java.util.List;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.physique.data.LivreDataService;
import lml.snir.mediatheque.physique.data.PhysiqueDataFactory;

/**
 *
 * @author jupiter
 */
public class LivreServiceImpl implements LivreService {
    private final LivreDataService livreDataService;
    
    public LivreServiceImpl() throws Exception {
        this.livreDataService = PhysiqueDataFactory.getLivreDataService();
    }

    @Override
    public List<Livre> getByAuteur(String auteur) throws Exception{
        return this.livreDataService.getByAuteur(auteur);
    }

    @Override
    public List<Livre> getByTitre(String titre) throws Exception {
        return this.livreDataService.getByTitre(titre);
    }

    @Override
    public List<Livre> getByMotsClefs(List<String> motClefs) throws Exception {
        return this.livreDataService.getByMotsClefs(motClefs);
    }

    @Override
    public Livre add(Livre livre) throws Exception {
        return this.livreDataService.add(livre);
    }

    @Override
    public void remove(Livre livre) throws Exception {
        // check if livre not borowed
        if (MetierFactory.getEmpruntService().getByLivre(livre) != null) {
            throw new Exception("Impossible de supprimer ce livre car il est déjà emprunté !");
        }
        this.livreDataService.remove(livre);
    }

    @Override
    public void update(Livre livre) throws Exception {
        this.livreDataService.update(livre);
    }

    @Override
    public Livre getById(Long id) throws Exception {
        return this.livreDataService.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.livreDataService.getCount();
    }

    @Override
    public List<Livre> getAll() throws Exception {
        return this.livreDataService.getAll();
    }

    @Override
    public List<Livre> getAll(int begin, int count) throws Exception {
        return this.livreDataService.getAll(begin, count);
    }
    
}
