package edu.msg.jthr.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Project extends BaseEntity{
	private static final long serialVersionUID = 1L;
	@Column
	private String projectName;
	
	public Project() {
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
