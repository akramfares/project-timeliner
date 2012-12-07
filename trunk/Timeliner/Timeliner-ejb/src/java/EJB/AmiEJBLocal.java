/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Ami;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author akram
 */
@Local
public interface AmiEJBLocal {
	
	public void Save(Ami a);
	public void update(Ami a);
	public void delete(Ami a);
	public Ami findByName(String nom);
    
}
