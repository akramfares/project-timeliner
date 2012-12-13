/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Utilisateur;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author akram
 */
@Local
public interface UtilisateurEJBLocal {
    
	public void Save(Utilisateur u);
	public void update(Utilisateur u);
	public void delete(Utilisateur u);
	public Utilisateur findByName(String nom);
        public boolean connexion(String nom, String motdepasse);
        public void inscription(String nom, String prenom, String motdepasse, String email, Date datenaissance, String adresse, boolean sexe);
}
