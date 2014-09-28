package edu.msg.jthr.backend.repository.bean;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Department;
import edu.msg.jthr.backend.repository.DepartmentRepository;

@Stateless(name = "DepartmentRepository", mappedName = "ejb/DepartmentRepository")
public class DepartmentRepositoryBean extends
		BaseRepositoryBean<Department, Long> implements DepartmentRepository {

	public DepartmentRepositoryBean() {
		super(Department.class);
	}

}
