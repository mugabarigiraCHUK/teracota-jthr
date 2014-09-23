package edu.msg.jthr.backend.model;

public class Position {
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", nrOfPlaces="
				+ nrOfPlaces + ", department=" + department + ", project="
				+ project + ", requirements=" + requirements
				+ ", responsibilities=" + responsibilities + "]";
	}

	private Long id;
	private String name = "pooooooosiziotn";
	private String nrOfPlaces;
	private String department;
	private String project;
	private String requirements;
	private String responsibilities;
	
	public Position(Long id, String name, String nrOfPlaces, String department,
			String project, String requirements, String responsibilities) {
		super();
		this.id = id;
		this.nrOfPlaces = nrOfPlaces;
		this.department = department;
		this.project = project;
		this.requirements = requirements;
		this.responsibilities = responsibilities;
	}

	public Position() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNrOfPlaces() {
		return nrOfPlaces;
	}

	public void setNrOfPlaces(String nrOfPlaces) {
		this.nrOfPlaces = nrOfPlaces;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	
	
}
