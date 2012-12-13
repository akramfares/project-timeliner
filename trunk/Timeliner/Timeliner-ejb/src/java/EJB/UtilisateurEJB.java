/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Utilisateur;
import java.util.Date;
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
                this.Save(u);
            }
            
        }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
