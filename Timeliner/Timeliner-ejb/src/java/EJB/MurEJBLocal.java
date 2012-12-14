/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import Entity.Status;
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
    
}
