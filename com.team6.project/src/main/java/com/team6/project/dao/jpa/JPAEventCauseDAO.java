package com.team6.project.dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;

import com.team6.project.dao.EventCauseDAO;
import com.team6.project.entities.EventCause;
import com.team6.project.entities.EventCausePK;
import com.team6.project.entities.Record;

/**
 * 
 * @author James Mc Ternan
 * @author Eoin Kernan
 *
 */
@Stateless
@Local
public class JPAEventCauseDAO implements EventCauseDAO {

	@PersistenceContext
	EntityManager em;

	@PersistenceContext
	private Session session;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<EventCause> getAllEventCauses() {
		Query q = em.createQuery("from EventCause");
		List<EventCause> result = q.getResultList();
		return result;
	}

	@Override
	public EventCause getEventCauseByKey(EventCausePK eventCausePK) {
		return em.find(EventCause.class, eventCausePK);
	}

	@Override
	public void addEventCauseData(EventCause eventCause) {
		em.persist(eventCause);
	}

	@Override
	public void addEventCauseCollection(Collection<EventCause> eventCause) {

		session.beginTransaction();

		for (EventCause e : eventCause) {
			em.persist(e);
		}

		session.getTransaction().commit();

	}

	@Override
	public void updateEventCause(EventCause eventCause) {
		em.merge(eventCause);
	}

	@Override
	public void deleteEventCause(EventCause eventCause) {
		em.remove(eventCause);
	}
}
