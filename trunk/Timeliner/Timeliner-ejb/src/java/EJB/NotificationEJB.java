/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Notification;
import javax.ejb.Stateful;

/**
 *
 * @author akram
 */
@Stateful
public class NotificationEJB implements NotificationEJBLocal {

	@Override
	public void Save(Notification n) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Notification n) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Notification n) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Notification findByProprio(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
