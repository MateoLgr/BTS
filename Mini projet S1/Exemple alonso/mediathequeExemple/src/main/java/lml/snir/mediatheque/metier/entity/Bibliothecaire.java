package lml.snir.mediatheque.metier.entity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jupiter
 */
public class Bibliothecaire extends Adherent {
    private String mdp;
    private String login;

    public Bibliothecaire(String nom, String prenom, String mdp, boolean encode, String login) {
        super(nom, prenom);
        this.login = login;
        if (encode) {
            this.mdp = this.codeMD5(mdp);
        } else {
            this.mdp = mdp;
        }
    }

    private String codeMD5(String msg) {
        String code = "";
        byte[] b = null;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            b = md.digest(msg.getBytes());
            for (int i = 0; i < b.length; i++) {
                int x = b[i];
                if (x < 0) {
                    x += 256;
                }

                code += Integer.toHexString(x);
            }
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }

        return code;
    }

    public boolean isValid(String mdp) {
        return this.mdp.equals(this.codeMD5(mdp));
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEncodedMdp(String password) {
        this.mdp = password;
    }
}
