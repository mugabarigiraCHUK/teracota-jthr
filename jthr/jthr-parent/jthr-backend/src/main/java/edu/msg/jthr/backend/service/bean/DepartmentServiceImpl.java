package edu.msg.jthr.backend.service.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.msg.jthr.backend.model.Department;
import edu.msg.jthr.backend.repository.bean.DepartmentDAOImpl;
import edu.msg.jthr.backend.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService{
	@EJB
	private EntityManager entityManager;
	@EJB
	private DepartmentDAOImpl departmentDAO;
	
	public DepartmentServiceImpl() {
		entityManager = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa").createEntityManager();
	}
	
	@Override
	public List<Department> getAll() {
		List<Department> positions = new ArrayList<Department>();

		entityManager.getTransaction().begin();
		positions = entityManager.createQuery("from Position", Department.class).getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();

		return positions;
	}

}
