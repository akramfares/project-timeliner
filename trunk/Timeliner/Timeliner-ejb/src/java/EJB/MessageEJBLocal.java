/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Message;
import javax.ejb.Local;

/**
 *
 * @author akram
 */
@Local
public interface MessageEJBLocal {
    
	public void Save(Message m);
	public void update(Message m);
	public void delete(Message m);
	public Message findByName(String nom);
}
