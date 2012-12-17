/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Notification;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author akram
 */
@Stateful
public class NotificationEJB implements NotificationEJBLocal {

        @PersistenceContext(unitName="TimelinerPU")
        private EntityManager em;
        
	@Override
	public void Save(Notification n) {
		em.persist(n);
	}

	@Override
	public void update(Notification n) {
		em.merge(n);
                em.persist(n);
	}

	@Override
	public void delete(Notification n) {
		em.remove(n);
                em.persist(n);
	}

	@Override
	public Notification findByProprio(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

        @Override
        public List<Notification> getAll() {
            Query q = em.createQuery("SELECT n FROM Notification n");
            return q.getResultList();
        }

        @Override
        public List<Notification> getNonLus() {
            Query q = em.createQuery("SELECT n FROM Notification n WHERE n.etat = false");
            return q.getResultList();
        }

}
