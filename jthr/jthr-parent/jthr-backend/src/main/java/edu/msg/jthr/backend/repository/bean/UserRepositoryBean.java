package edu.msg.jthr.backend.repository.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.UserRepository;

@Stateless (name="UserRepository", mappedName="ejb/UserRepository")
public class UserRepositoryBean extends BaseRepositoryBean<User, Long> implements UserRepository {

	public UserRepositoryBean() {
		super(User.class);
	}

	@Override
	public List<User> getUserbyFilter(String pattern) {
		final CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<User> criteriaQuery = cb.createQuery(clazz);
		final Root<User> rt = criteriaQuery.from(User.class);
		criteriaQuery.where(cb.equal(rt.get("username"), pattern));
		final CriteriaQuery<User> all = criteriaQuery.select(rt);
		final TypedQuery<User> allQuery = getEntityManager().createQuery(all);

		return allQuery.getResultList();
	}

}