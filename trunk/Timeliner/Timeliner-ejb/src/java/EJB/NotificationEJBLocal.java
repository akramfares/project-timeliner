/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Notification;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author akram
 */
@Local
public interface NotificationEJBLocal {
    
	public void Save(Notification n);
	public void update(Notification n);
	public void delete(Notification n);
	public Notification findByProprio(String nom);
        public List<Notification> getAll();
        public List<Notification> getNonLus();
}
