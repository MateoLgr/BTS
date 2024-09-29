package lml.snir.mediatheque.metier;

import java.util.ArrayList;
import java.util.List;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;
import lml.snir.mediatheque.metier.transactionnel.AdherentService;
import lml.snir.tools.ServiceSimulator;

/**
 *
 * @author fanou
 */
class AdherentServiceSimuImpl extends ServiceSimulator<Adherent> implements AdherentService {

    public AdherentServiceSimuImpl() throws Exception {
        Adherent a = new Adherent("ALONSO", "Stéphane");
        this.add(a);
        a = new Adherent("ALONSO", "Chloé");
        this.add(a);
    }

    @Override
    public List<Adherent> getByNom(String nom) throws Exception {
        List<Adherent> adherents = new ArrayList<>();
        
        for (Adherent a : super.getAll()) {
            if (a.getNom().equals(nom)) {
                adherents.add(a);
            }
        }
        
        return adherents;
    }

    @Override
    public List<Adherent> getByPrenom(String prenom) throws Exception {
        List<Adherent> adherents = new ArrayList<>();
        
        for (Adherent a : super.getAll()) {
            if (a.getPrenom().equals(prenom)) {
                adherents.add(a);
            }
        }
        
        return adherents;
    }

    @Override
    public Bibliothecaire getByLogin(String login) throws Exception {
        Bibliothecaire b = null;
        
        for (Adherent a : super.getAll()) {
            if (a instanceof Bibliothecaire) {
                Bibliothecaire bib = (Bibliothecaire) a;
                if (bib.getLogin().equals(login)) {
                    b = bib;
                    break;
                }
            }
        }
        
        return b;
    }

    @Override
    public int getBibliothecaireCount() throws Exception {
        int count = 0;
        
        for (Adherent a : super.getAll()) {
            if (a instanceof Bibliothecaire) {
                count++;
            }
        }
        
        return count;
    }
    
}
