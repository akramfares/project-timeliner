/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Mur;
import Entity.Status;
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
public class StatusEJB implements StatusEJBLocal {

        @PersistenceContext(unitName="TimelinerPU")
        protected EntityManager em;
        
	@Override
	public void Save(Status s) {
		em.persist(s);
	}

	@Override
	public void update(Status s) {
		em.merge(s);
                em.persist(s);
	}

	@Override
	public void delete(Status s) {
		em.remove(s);
                em.persist(s);
	}

	@Override
	public Status findByProprio(String nom) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

        // Supprimer les status relatifs à un mur
        @Override
        public void deleteStatusByMur(Mur m) {
             Query q = em.createQuery("SELECT s FROM Status s WHERE s.mur=?");
             q.setParameter(1, m);
            for(Status s : (List<Status>) q.getResultList()) {
                this.delete(s);
            }
        }

}
