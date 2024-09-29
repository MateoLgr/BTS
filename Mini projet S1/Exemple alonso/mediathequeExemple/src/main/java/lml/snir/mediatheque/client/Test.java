package lml.snir.mediatheque.client;

import java.util.List;
import lml.snir.mediatheque.metier.MetierFactory;
import lml.snir.mediatheque.metier.entity.Adherent;
import lml.snir.mediatheque.metier.entity.Bibliothecaire;
import lml.snir.mediatheque.metier.entity.Emprunt;
import lml.snir.mediatheque.metier.entity.Livre;
import lml.snir.mediatheque.metier.transactionnel.AdherentService;
import lml.snir.mediatheque.physique.data.AdherentDataService;
import lml.snir.mediatheque.physique.data.EmpruntDataService;
import lml.snir.mediatheque.physique.data.LivreDataService;
import lml.snir.mediatheque.physique.data.PhysiqueDataFactory;

/**
 *
 * @author fanou
 */
public class Test {
    private Livre livre;
    private Adherent adherent;
    private Emprunt emprunt;
    
    public static void main(String[] args) throws Exception {
        // ICI les tests de bases !
        Test test = new Test();
        
        test.testAdherentDataService();
        
        test.testLivreDataService();
        
        test.testEmpruntDataService();
    }
    
    private void testLivreDataService() throws Exception {
        LivreDataService livreDataService = PhysiqueDataFactory.getLivreDataService();
        livre = new Livre("ALONSO", "JAVA FOR DUMMYS");
        livre = livreDataService.add(livre);
        
        livre = new Livre("VENESSON", "NUTRITION DE LA FORCE");
        livre = livreDataService.add(livre);
        
        livre = new Livre("VENESSON", "NUTRITION DE LA FORCE");
        livre = livreDataService.add(livre);
        
        livre = new Livre("VENESSON", "PALEONUTRITION");
        livre = livreDataService.add(livre);
        
        livre = new Livre("ORWELL", "1984");
        livre = livreDataService.add(livre);
        
        livre = new Livre("ORWELL", "1984");
        livre = livreDataService.add(livre);
        
        livre = new Livre("HUXLEY", "LE MEILLEURS DES MONDES");
        livre = livreDataService.add(livre);
        
        livre = new Livre("HUXLEY", "RETOUR AU MEILLEURS DES MONDES");
        livre = livreDataService.add(livre);
        
        List<Livre> livres = livreDataService.getAll();
        for (Livre l : livres) {
            System.out.println(l);
        }
    }
    
    private void testEmpruntDataService() throws Exception {
        EmpruntDataService empruntDataService = PhysiqueDataFactory.getEmpruntDataService();
        this.emprunt = new Emprunt(livre, adherent);
        this.emprunt = empruntDataService.add(emprunt);
        List<Emprunt> emprunts = empruntDataService.getAll();
        for (Emprunt e : emprunts) {
            System.out.println(e);
        }
    }
    
    private void testAdherentDataService() throws Exception {
        AdherentDataService adherentDataService = PhysiqueDataFactory.getAdherentDataService();
        this.adherent = new Adherent("SIMPSON", "HOMER");
        this.adherent = adherentDataService.add(adherent);
        
        this.adherent = new Adherent("SIMPSON", "BART");
        this.adherent = adherentDataService.add(adherent);
        
        this.adherent = new Adherent("SIMPSON", "LISA");
        this.adherent = adherentDataService.add(adherent);
        
        this.adherent = new Adherent("ALONSO", "Stéphane");
        this.adherent = adherentDataService.add(adherent);
        
        List<Adherent> adherents = adherentDataService.getAll();
        for (Adherent a : adherents) {
            System.out.println(a);
        }
    }
    
    private void testAdherentService() throws Exception {
        AdherentService adherentService = MetierFactory.getAdherentService();
        List<Adherent> adherents = adherentService.getAll();
        for (Adherent a : adherents) {
            System.out.println(a);
        }
        System.out.println(adherentService.getBibliothecaireCount());
        System.out.println(adherentService.getByLogin("admin"));
        
        Bibliothecaire b = new Bibliothecaire("admin", "admin", "admin", true, "admin");
        adherentService.add(b);
        b = null;
        
        System.out.println(adherentService.getBibliothecaireCount());
        System.out.println(adherentService.getByLogin("admin"));
    }
}
