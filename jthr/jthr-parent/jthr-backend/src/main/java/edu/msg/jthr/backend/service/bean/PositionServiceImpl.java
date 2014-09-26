package edu.msg.jthr.backend.service.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.bean.PositionDAOImpl;
import edu.msg.jthr.backend.service.PositionService;

@Stateful
public class PositionServiceImpl implements PositionService {
	@EJB
	private EntityManager entityManager;
	@EJB
	private PositionDAOImpl positionDAO;

	public PositionServiceImpl() {
		entityManager = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa").createEntityManager();
	}

	@Override
	public void add(Position position) {
		entityManager.getTransaction().begin();
		entityManager.persist(position);
		entityManager.getTransaction().commit();
	}

	@Override
	public void edit(Position position) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Position getById(Long id) {
		entityManager.getTransaction().begin();
		Position position = entityManager.createQuery("from Position where id = ?", Position.class).setParameter(1, id).getSingleResult(); // TODO
		entityManager.getTransaction().commit();
		return position;
	}

	@Override
	public List<Position> getAll() {
		List<Position> positions = new ArrayList<Position>();
		entityManager.getTransaction().begin();
		positions = entityManager.createQuery("from Position", Position.class).getResultList();
		entityManager.getTransaction().commit();
		return positions;
	}
}
