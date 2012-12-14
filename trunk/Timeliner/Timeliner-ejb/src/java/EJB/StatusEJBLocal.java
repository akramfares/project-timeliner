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
public interface StatusEJBLocal {
    
	public void Save(Status s);
	public void update(Status s);
	public void delete(Status s);
	public Status findByProprio(String nom);
        public void deleteStatusByMur(Mur m);
}
