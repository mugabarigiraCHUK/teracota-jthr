package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Project;
import edu.msg.jthr.backend.repository.ProjectRepository;
import edu.msg.jthr.backend.service.ProjectService;

@Stateless(name = "ProjectService", mappedName = "ejb/ProjectService")
@DependsOn({ "ProjectRepository" })
public class ProjectServiceBean implements ProjectService {

	@EJB
	private ProjectRepository repository;

	@Override
	public Project getProjectById(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Project> getAllProjects() {
		return repository.getAll();
	}


}
