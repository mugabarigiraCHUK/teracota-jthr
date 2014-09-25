package edu.msg.jthr.backend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Position extends BaseEntity{
	private static final long serialVersionUID = 1L;
	
	@Column
	private String name;
	@Column
	private Integer nrOfPlaces;
	@Column
	private Department department;
	@Column
	private String project;
	@Column
	private String requirements;
	@Column
	private String responsibilities;
	@Column
	private Boolean isApproved;
	@Column
	private List<Comment> comments;
	@Column
	private List<Candidate> candidates;
	@Column
	private User creator;

	public Position() {
	}

	

	
	@Override
	public String toString() {
		return "Position [id=" + getId() + ", name=" + name + ", nrOfPlaces="
				+ nrOfPlaces + ", department=" + department + ", project="
				+ project + ", requirements=" + requirements
				+ ", responsibilities=" + responsibilities + "]";
	}
}
