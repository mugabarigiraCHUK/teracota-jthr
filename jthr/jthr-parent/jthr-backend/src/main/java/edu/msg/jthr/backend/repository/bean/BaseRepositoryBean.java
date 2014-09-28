package edu.msg.jthr.backend.repository.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import edu.msg.jthr.backend.model.AbstractModel;
import edu.msg.jthr.backend.repository.BaseRepository;

public abstract class BaseRepositoryBean<T extends AbstractModel, I> implements
		BaseRepository<T, I> {

	public final Class<T> clazz;

	@PersistenceContext
	private EntityManager entityManager;

	public BaseRepositoryBean(final Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public T save(T e) {

		entityManager.persist(e);
		entityManager.flush();

		return e;
	}

	@Override
	public T merge(T e) {

		e = entityManager.merge(e);
		entityManager.flush();
		return e;
	}

	@Override
	public void delete(T e) {
		e = entityManager.merge(e);
		entityManager.remove(e);
		entityManager.flush();
	}

	@Override
	public List<T> getAll() {

		final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		final CriteriaQuery<T> criteriaQuery = cb.createQuery(clazz);
		final Root<T> rootEntry = criteriaQuery.from(clazz);
		final CriteriaQuery<T> all = criteriaQuery.select(rootEntry);
		final TypedQuery<T> allQuery = entityManager.createQuery(all);

		return allQuery.getResultList();
	}

	@Override
	public T getById(I id) {

		return entityManager.find(clazz, id);

	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
