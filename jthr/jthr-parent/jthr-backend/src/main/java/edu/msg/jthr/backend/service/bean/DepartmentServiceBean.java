package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Department;
import edu.msg.jthr.backend.repository.DepartmentRepository;
import edu.msg.jthr.backend.service.DepartmentService;

@Stateless(name = "DepartmentService", mappedName = "ejb/DepartmentService")
@DependsOn({ "DepartmentRepository" })
public class DepartmentServiceBean implements DepartmentService {

	@EJB
	private DepartmentRepository repository;

	@Override
	public Department getDepartmentById(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Department> getAllDepartments() {
		return repository.getAll();
	}
}
