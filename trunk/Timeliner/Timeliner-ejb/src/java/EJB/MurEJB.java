/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author akram
 */
@Stateful
public class MurEJB implements MurEJBLocal {
        @PersistenceContext(unitName="TimelinerPU")
        private EntityManager em;
        
	@Override
	public void Save(Mur m) {
		em.persist(m);
	}

	@Override
	public void update(Mur m) {
		em.merge(m);
                em.persist(m);
	}

	@Override
	public void delete(Mur m) {
		em.remove(m);
                em.persist(m);
	}

	@Override
	public Mur findByProprio(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
