/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Utilisateur;
import javax.ejb.Stateful;

/**
 *
 * @author akram
 */
@Stateful
public class UtilisateurEJB implements UtilisateurEJBLocal {

	@Override
	public void Save(Utilisateur u) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Utilisateur u) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Utilisateur u) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Utilisateur findByName(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
