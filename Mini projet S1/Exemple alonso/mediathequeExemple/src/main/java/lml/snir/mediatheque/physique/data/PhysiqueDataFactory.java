package lml.snir.mediatheque.physique.data;

/**
 *
 * @author fanou
 */
public class PhysiqueDataFactory {

    private PhysiqueDataFactory() {
    }

    private static AdherentDataService adherentDataSrv = null;
    public static AdherentDataService getAdherentDataService() throws Exception {
        if (adherentDataSrv == null) {
            adherentDataSrv = new AdherentDataServiceJDBCImpl();
        }
        return adherentDataSrv;
    }
    
    private static EmpruntDataService empruntDataSrv = null;
    public static EmpruntDataService getEmpruntDataService() throws Exception {
        if (empruntDataSrv == null) {
            empruntDataSrv = new EmpruntDataServiceJDBCImpl();
        }
        return empruntDataSrv;
    }
    
    private static LivreDataService livreDataSrv = null;
    public static LivreDataService getLivreDataService() throws Exception {
        if (livreDataSrv == null) {
            livreDataSrv = new LivreDataServiceJDBCImpl();
        }
        
        return livreDataSrv;
    }
}
