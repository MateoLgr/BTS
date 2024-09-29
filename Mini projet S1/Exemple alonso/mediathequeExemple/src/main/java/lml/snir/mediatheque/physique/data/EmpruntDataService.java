package lml.snir.mediatheque.physique.data;

import java.util.Date;
import java.util.List;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.persistence.CrudService;

/**
 *
 * @author fanou
 */
public interface EmpruntDataService extends CrudService<Emprunt>{
    public Emprunt getByLivre(Livre livre) throws Exception;
    public List<Emprunt> getByAdherent(Adherent adherent) throws Exception;
    public int getCountByAdherent(Adherent adherent) throws Exception;
    public List<Emprunt> getByDate(Date date) throws Exception;
}
