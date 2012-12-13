/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Ami;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author akram
 */
@Stateful
public class AmiEJB implements AmiEJBLocal {
        @PersistenceContext(unitName="TimelinerPU")
        private EntityManager em;

	@Override
	public void Save(Ami a) {
		em.persist(a);
	}

	@Override
	public void update(Ami a) {
		em.merge(a);
                em.persist(a);
	}

	@Override
	public void delete(Ami a) {
		em.remove(a);
                em.persist(a);
	}

	@Override
	public Ami findByName(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
