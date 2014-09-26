package edu.msg.jthr.backend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Interview extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Column
	String date;
	@OneToMany(cascade={CascadeType.ALL}) 
	@JoinTable(name="INTERVIEW_USER", joinColumns={@JoinColumn(name="INTERVIEW_ID")}, inverseJoinColumns={@JoinColumn(name="USER_ID")})
	List<User> interviewers;
	@OneToMany(cascade={CascadeType.ALL}) 
	@JoinTable(name="INTERVIEW_COMMENT", joinColumns={@JoinColumn(name="INTERVIEW_ID")}, inverseJoinColumns={@JoinColumn(name="COMMENT_ID")})
	List<Comment> comments;

	public Interview(String date, List<User> interviewers,
			List<Comment> comments) {
		super();
		this.date = date;
		this.interviewers = interviewers;
		this.comments = comments;
	}

	public String getDate() {
		return date;
	}

	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interview(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<User> getInterviewers() {
		return interviewers;
	}

	public void setInterviewers(List<User> interviewers) {
		this.interviewers = interviewers;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
