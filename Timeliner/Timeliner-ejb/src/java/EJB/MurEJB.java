/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import javax.ejb.Stateful;

/**
 *
 * @author akram
 */
@Stateful
public class MurEJB implements MurEJBLocal {

	@Override
	public void Save(Mur m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Mur m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Mur m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Mur findByProprio(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
