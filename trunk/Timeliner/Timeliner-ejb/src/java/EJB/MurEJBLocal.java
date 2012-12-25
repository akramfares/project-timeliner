/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import Entity.Status;
import Entity.Utilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author akram
 */
@Local
public interface MurEJBLocal {
	
	public void Save(Mur m);
	public void update(Mur m);
	public void delete(Mur m);
	public Mur findByProprio(String nom);
        public void addStatus(Status status);
        public void clearStatus(Mur m);
        public List<Status> getAllStatus();
        public List<Status> getUserMur(Utilisateur u);
    
}
