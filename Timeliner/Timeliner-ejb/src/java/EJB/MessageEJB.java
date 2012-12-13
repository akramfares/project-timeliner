/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Message;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author akram
 */
@Stateful
public class MessageEJB implements MessageEJBLocal {
        
        @PersistenceContext(unitName="TimelinerPU")
        private EntityManager em;
        
	@Override
	public void Save(Message m) {
                em.persist(m);
	}

	@Override
	public void update(Message m) {
		em.merge(m);
                em.persist(m);
	}

	@Override
	public void delete(Message m) {
		em.remove(m);
                em.persist(m);
	}

	@Override
	public Message findByName(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
