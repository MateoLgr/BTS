package lml.snir.mediatheque.metier;

import lml.snir.mediatheque.metier.transactionnel.AdherentService;
import lml.snir.mediatheque.metier.transactionnel.AdherentServiceImpl;
import lml.snir.mediatheque.metier.transactionnel.EmpruntService;
import lml.snir.mediatheque.metier.transactionnel.EmpruntServiceImpl;
import lml.snir.mediatheque.metier.transactionnel.LivreService;
import lml.snir.mediatheque.metier.transactionnel.LivreServiceImpl;

public class MetierFactory {  
   private MetierFactory(){}

   private static AdherentService adherentSrv = null;
   public static  AdherentService getAdherentService() throws Exception {
       if (adherentSrv == null) {
           adherentSrv = new AdherentServiceImpl();
       }
       return adherentSrv;
   }
   
   private static LivreService livreSrv = null;
   public static  LivreService getLivreService() throws Exception {
       if (livreSrv == null) {
           livreSrv = new LivreServiceImpl();
       }
       return livreSrv;
   }
   
   private static EmpruntService empruntSrv = null;
   public static  EmpruntService getEmpruntService() throws Exception {
       if (empruntSrv == null) {
           empruntSrv = new EmpruntServiceImpl();
       }
       return empruntSrv;
   }
}
