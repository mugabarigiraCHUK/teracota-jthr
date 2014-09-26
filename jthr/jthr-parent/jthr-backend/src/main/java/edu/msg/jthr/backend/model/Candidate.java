package edu.msg.jthr.backend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Candidate extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Column
	private String lastName;
	@Column
	private String firstName;
	@Column
	private String telephone;
	@Column
	private String mobTelephone;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private Boolean relocation;
	@Column
	private String CV;
	@OneToMany(cascade={CascadeType.PERSIST})
	@JoinTable(name = "CANDIDATE_INTERVIEW", joinColumns = { @JoinColumn(name = "CANDIDATE_ID") }, inverseJoinColumns = { @JoinColumn(name = "INTERVIEW_ID") })
	private List<Interview> interviews;
	@OneToMany(cascade={CascadeType.PERSIST})
	@JoinTable(name = "CANDIDATE_COMMENT", joinColumns = { @JoinColumn(name = "CANDIDATE_ID") }, inverseJoinColumns = { @JoinColumn(name = "COMMENT_ID") })
	private List<Comment> comments;

	public List<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Candidate() {
	}


	public Candidate(String lastName, String firstName, String telephone,
			String mobTelephone, String email, String address,
			Boolean relocation, String CV, List<Interview> interviews,
			List<Comment> comments) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.telephone = telephone;
		this.mobTelephone = mobTelephone;
		this.email = email;
		this.address = address;
		this.relocation = relocation;
		this.CV = CV;
		this.interviews = interviews;
		this.comments = comments;
	}

	public Candidate(Long id, String lastName, String firstName,
			String telephone, String mobTelephone, String email,
			String address, Boolean relocation, String CV,
			List<Interview> interviews, List<Comment> comments) {
		super(id);
		this.lastName = lastName;
		this.firstName = firstName;
		this.telephone = telephone;
		this.mobTelephone = mobTelephone;
		this.email = email;
		this.address = address;
		this.relocation = relocation;
		this.CV = CV;
		this.interviews = interviews;
		this.comments = comments;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getRelocation() {
		return relocation;
	}

	public void setRelocation(Boolean relocation) {
		this.relocation = relocation;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobTelephone() {
		return mobTelephone;
	}

	public void setMobTelephone(String mobTelephone) {
		this.mobTelephone = mobTelephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCV() {
		return CV;
	}

	public void setCV(String cV) {
		CV = cV;
	}

}
