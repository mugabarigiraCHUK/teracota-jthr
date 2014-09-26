package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Project;

@Local
public interface ProjectService {
	Project getProjectById(Long id);

	List<Project> getAllProjects();
}
