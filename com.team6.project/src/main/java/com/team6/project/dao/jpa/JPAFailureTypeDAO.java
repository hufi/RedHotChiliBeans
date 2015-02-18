package com.team6.project.dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.team6.project.dao.FailureTypeDAO;
import com.team6.project.entities.BaseData;
import com.team6.project.entities.FailureType;

/**
 * Concrete implementation of CRUD operations. 
 * @author James
 *
 */

@Stateless
@Local
@Default
public class JPAFailureTypeDAO implements FailureTypeDAO {

	@PersistenceContext
	private EntityManager em;
	
	public Collection<FailureType> getAllFailureTypes(){
    	Query query = em.createQuery("from FailureType");
		List<FailureType> results = query.getResultList();
		return results;
    }
	
	/**
	 * Get failure Type by failure code.
	 * @param failureCode
	 * @return FailureType
	 */
	
	public FailureType getFailureType(Integer failureCode){
		Query q = em.createQuery("from FailureType where failureCode = :code");
		q.setParameter("code", failureCode);	
		List<FailureType> result = q.getResultList();
		return result.get(0);
	}
	
	
	/**
	 * 
	 * @param failureType
	 */
	
	public void addFailureType(FailureType failureType){
		em.persist(failureType);
	}
	
	
	/**
	 * Search for FailureType by FailureCode. Merge any changes to existing record. 
	 * @param failureType
	 */
	
	public void updateFailureType(FailureType failureType){
		FailureType ft = getFailureType(2);
		ft.setDescription(failureType.getDescrption());
		ft.setFailureCode(failureType.getFailureCode());
		em.merge(ft);
		
	}
	
	
	/**
	 * Delete FailureType by failure code.
	 */
	public void deleteFailureType(Integer failureCode){
		Query q = em.createQuery("from FailureType where failureCode = :code");
		q.setParameter("code", failureCode);
		List<FailureType> result = q.getResultList();
		em.remove(result.get(0));
		
	}

	
}
