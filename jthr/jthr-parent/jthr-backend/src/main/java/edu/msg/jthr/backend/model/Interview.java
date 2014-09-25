package edu.msg.jthr.backend.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Interview extends BaseEntity {

	private static final long serialVersionUID = 1L;
	String date;
	List<User> interviewers;
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
