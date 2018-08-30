package br.com.gsete.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

public abstract class GenericRepository<T> {
	
	protected EntityManagerFactory emf;
	protected EntityManager em;
	protected Long size;
	private Class<T> entityClass;
	
	public GenericRepository(Class<T> entityClass) {
		emf = Persistence.createEntityManagerFactory("GsetePU");
		em = emf.createEntityManager();
		this.entityClass = entityClass;
	}
	
	protected EntityManager getConnection() { return em; }
	
	public T findBy(Long id) { return em.find(entityClass, id); }

	public List<T> findAll() {
		String entidade = entityClass.getName();
		TypedQuery<T> query = em.createQuery("SELECT e FROM " + entidade + " e order by nome", entityClass);
		List<T> todos = (List<T>) query.getResultList();
		size = (long) todos.size();
		return todos;
	}
	
	protected List<T> findWithName(String nome, int inicio, int limite) {
		String entidade = entityClass.getName();
		size = count(nome, entidade);
		TypedQuery<T> query = em.createQuery("SELECT e FROM " + entidade + " e WHERE lower(e.nome) LIKE '" + nome.toLowerCase() + "%' order by nome", entityClass);
		query.setFirstResult(inicio);
		query.setMaxResults(limite);
		return query.getResultList();
	}
	
	@Transactional
	public boolean save(T object) { 
		em.persist(object); 
		return true;
	}
		
	@Transactional
	public boolean update(T object) { 
		em.merge(object); 
		return true;
	}
	
	@Transactional
	public boolean remove(Long id) { 
		T entidade = findBy(id);
		if(entidade != null) {
			em.remove(entidade);
			return true;
		}
		return false;
	}
	
	private Long count(String nome, String entidade) {
		Query query = em.createQuery("SELECT COUNT(e) FROM " + entidade + " e WHERE lower(e.nome) LIKE '" + nome.toLowerCase() + "%'");
		return (Long) query.getSingleResult();
	}
}
