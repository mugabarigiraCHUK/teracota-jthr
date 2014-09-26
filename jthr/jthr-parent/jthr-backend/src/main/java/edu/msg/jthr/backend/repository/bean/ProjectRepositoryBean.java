package edu.msg.jthr.backend.repository.bean;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Project;
import edu.msg.jthr.backend.repository.ProjectRepository;

@Stateless(name = "ProjectRepository", mappedName = "ejb/ProjectRepository")
public class ProjectRepositoryBean extends BaseRepositoryBean<Project, Long>
		implements ProjectRepository {

	public ProjectRepositoryBean() {
		super(Project.class);
	}

}
