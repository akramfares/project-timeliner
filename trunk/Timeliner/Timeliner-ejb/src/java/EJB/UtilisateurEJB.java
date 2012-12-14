/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import Entity.Status;
import Entity.Utilisateur;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author akram
 */
@Stateful
public class UtilisateurEJB implements UtilisateurEJBLocal {

        @PersistenceContext(unitName="TimelinerPU")
        protected EntityManager em;
        @EJB
        MurEJBLocal murEJB;
        private Utilisateur userConnected; // Pour récupérer l'utilisateur connecté

        @Override
        public Utilisateur getUserConnected() {
            return userConnected;
        }

        @Override
        public void setUserConnected(Utilisateur userConnected) {
            this.userConnected = userConnected;
        }
        
	@Override
	public void Save(Utilisateur u) {
		em.persist(u);
	}

	@Override
	public void update(Utilisateur u) {
		em.merge(u);
                em.persist(u);
	}

	@Override
	public void delete(Utilisateur u) {
		// Supprimer les status sur son mur
                murEJB.clearStatus(u.getMur());
                // Supprimer son mur
                murEJB.delete(u.getMur());
                // Supprimer l'utilisateur
                em.remove(u);
                em.persist(u);
	}

	@Override
	public Utilisateur findByName(String nom) {
		return em.find(Utilisateur.class, nom);
	}
        
        @Override
        public boolean connexion(String nom,String motdepasse){
            Utilisateur u=em.find(Utilisateur.class, nom);
            if(u.getMotdepasse().equals(motdepasse)) {
                userConnected = u; // Initialiser l'utilisateur connecté
                return true;
            }
            else {
                return false;
            }
        }
        
        @Override
        public void inscription(String nom, String prenom, String motdepasse, String email, Date datenaissance, String adresse, boolean sexe){
            Utilisateur u= new Utilisateur(nom,prenom,motdepasse,email,datenaissance,adresse,sexe);
            if(em.find(Utilisateur.class,email).getEmail().equals(email)){
                // Enregistrement de l'utilisateur
                this.Save(u);
                // Création du mur de l'utilisateur
                murEJB.Save(new Mur(u));
                // Ajouter un message sur son mur.
                murEJB.addStatus(new Status(u, "Bonjour, je viens de m'inscrire sur timeliner", u.getMur()));
            }
            
        }
        
        

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
