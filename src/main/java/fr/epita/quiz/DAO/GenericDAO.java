package fr.epita.quiz.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;


public abstract class GenericDAO<T,I> {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void insert(T object) {
		em.persist(object);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void delete(I id) {
		T obj = em.find(getEntityClass(), id);
		em.remove(obj);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void update(T object) {
		em.merge(object);
	}
	
	public void fetch() {
		
	}
	
	
	
	public abstract String getQuery();

	public abstract void setParameters(Map<String, Object> parameters, T criteria);

	public List<T> search(T criteria) {
		Query searchQuery = em.createQuery(getQuery());
		Map<String, Object> parameters = new LinkedHashMap<String, Object>();
		setParameters(parameters, criteria);
		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			searchQuery.setParameter(entry.getKey(), entry.getValue());
		}
		return searchQuery.getResultList();

	}

	
	public T getById(I id) {
		return em.find(getEntityClass(), id);
	}

	public abstract Class<T> getEntityClass();
}
