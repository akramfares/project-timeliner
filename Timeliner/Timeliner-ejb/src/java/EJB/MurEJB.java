/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import Entity.Status;
import java.util.List;
import javax.ejb.EJB;
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
        @EJB
        StatusEJBLocal statusEJB;
        
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

        @Override
        public void addStatus(Status status) {
            statusEJB.Save(status);
        }

        @Override
        public void clearStatus(Mur m) {
            statusEJB.deleteStatusByMur(m);
        }

        @Override
        public List<Status> getAllStatus() {
            return statusEJB.getAll();
        }

}
