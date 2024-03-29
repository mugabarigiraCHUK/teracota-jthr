package edu.msg.jthr.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Position extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column
	private String name;
	@Column
	private Integer nrOfPlaces;
	

	@OneToOne(fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Department department;
	
	@OneToOne(fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Project project;
	@Column
	private String requirements;
	@Column
	private String responsibilities;
	@Column
	private Boolean isApproved = false;
	@Column
	private Boolean isClosed = false;
	@OneToOne(fetch=FetchType.EAGER) //cascade={CascadeType.PERSIST}, 
	//@JoinColumn
	private User creator;
	
	@OneToMany(cascade={CascadeType.PERSIST}) 
	@JoinTable
	private List<Comment> comments = new ArrayList<>();
	
	@OneToMany(cascade={CascadeType.PERSIST}) 
	@JoinTable
	private List<Candidate> candidates = new ArrayList<>();

	@OneToMany(cascade={CascadeType.PERSIST}) 
	@JoinTable(name="POSITION_ACCEPTEDCANDIDATE", joinColumns={@JoinColumn(name="POSITION_ID")}, inverseJoinColumns={@JoinColumn(name="CANDIDATE_ID")})
	private List<Candidate> acceptedCandidates = new ArrayList<>();

	public Position() {
	}

	public Position(String name, Integer nrOfPlaces, Department department,
			Project project, String requirements, String responsibilities,
			Boolean isApproved, List<Comment> comments,
			List<Candidate> candidates, User creator, Boolean isClosed) {
		super();
		this.name = name;
		this.nrOfPlaces = nrOfPlaces;
		this.department = department;
		this.project = project;
		this.requirements = requirements;
		this.responsibilities = responsibilities;
		this.isApproved = isApproved;
		this.comments = comments;
		this.candidates = candidates;
		this.creator = creator;
		this.setIsClosed(isClosed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNrOfPlaces() {
		return nrOfPlaces;
	}

	public void setNrOfPlaces(Integer nrOfPlaces) {
		this.nrOfPlaces = nrOfPlaces;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
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

	public Boolean getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public List<Candidate> getAcceptedCandidates() {
		return acceptedCandidates;
	}

	public void setAcceptedCandidates(List<Candidate> acceptedCandidates) {
		this.acceptedCandidates = acceptedCandidates;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Boolean getIsClosed() {
		return isClosed;
	}

	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}

	@Override
	public String toString() {
		return "Position [id=" + getId() + ", name=" + name + ", nrOfPlaces="
				+ nrOfPlaces + ", department=" + department + ", project="
				+ project + ", requirements=" + requirements
				+ ", responsibilities=" + responsibilities + "]";
	}
}
