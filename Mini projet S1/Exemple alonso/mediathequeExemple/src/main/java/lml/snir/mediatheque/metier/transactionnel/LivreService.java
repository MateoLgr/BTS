package lml.snir.mediatheque.metier.transactionnel;

import lml.snir.mediatheque.metier.entity.Livre;
import java.util.List;
import lml.snir.persistence.CrudService;

/**
 *
 * @author jupiter
 */
public interface LivreService extends CrudService<Livre> {
    public List<Livre> getByAuteur(String auteur) throws Exception;
    public List<Livre> getByTitre(String titre) throws Exception;
    public List<Livre> getByMotsClefs (List<String> motClefs) throws Exception;
}
