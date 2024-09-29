package lml.snir.mediatheque.physique.data;

import java.util.List;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;
import lml.snir.persistence.CrudService;

/**
 *
 * @author fanou
 */
public interface AdherentDataService extends CrudService<Adherent> {
    public List<Adherent> getByNom(String nom) throws Exception;
    public List<Adherent> getByPrenom(String prenom) throws Exception;
    public Bibliothecaire getByLogin(String login) throws Exception;
    public int getBibliothecaireCount() throws Exception;
}