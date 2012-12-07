/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Status;
import javax.ejb.Stateful;

/**
 *
 * @author akram
 */
@Stateful
public class StatusEJB implements StatusEJBLocal {

	@Override
	public void Save(Status s) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Status s) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Status s) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Status findByProprio(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
