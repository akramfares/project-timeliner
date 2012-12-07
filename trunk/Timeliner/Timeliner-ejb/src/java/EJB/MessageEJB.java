/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Message;
import javax.ejb.Stateful;

/**
 *
 * @author akram
 */
@Stateful
public class MessageEJB implements MessageEJBLocal {

	@Override
	public void Save(Message m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Message m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Message m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Message findByName(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
