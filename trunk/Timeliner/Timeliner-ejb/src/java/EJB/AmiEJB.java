/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Ami;
import javax.ejb.Stateful;

/**
 *
 * @author akram
 */
@Stateful
public class AmiEJB implements AmiEJBLocal {

	@Override
	public void Save(Ami a) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Ami a) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Ami a) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Ami findByName(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
