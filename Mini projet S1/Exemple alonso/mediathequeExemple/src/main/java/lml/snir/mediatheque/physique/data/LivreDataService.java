package lml.snir.mediatheque.physique.data;

import java.util.List;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.persistence.CrudService;

/**
 *
 * @author fanou
 */
public interface LivreDataService extends CrudService<Livre>{
    public List<Livre> getByAuteur(String auteur) throws Exception;
    public List<Livre> getByTitre(String titre) throws Exception;
    public List<Livre> getByTitreEtDispo(String titre, boolean disponible) throws Exception;
    public List<Livre> getByMotsClefs (List<String> motClefs) throws Exception;
}
