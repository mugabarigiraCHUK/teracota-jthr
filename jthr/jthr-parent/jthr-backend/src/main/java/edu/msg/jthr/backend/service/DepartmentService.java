package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Department;

@Local
public interface DepartmentService {
	Department getDepartmentById(Long id);

	List<Department> getAllDepartments();
}
