package lml.snir.mediatheque.metier.transactionnel;

import java.util.List;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;
import lml.snir.persistence.CrudService;

/**
 * Défini les services à rendre, elle ne dit pas comment on fait (pas de code !!)
 * @author jupiter
 */
public interface AdherentService extends CrudService<Adherent> {
    public List<Adherent> getByNom(String nom) throws Exception;
    public List<Adherent> getByPrenom(String prenom) throws Exception;
    public Bibliothecaire getByLogin(String login) throws Exception;
    public int getBibliothecaireCount() throws Exception;
}

