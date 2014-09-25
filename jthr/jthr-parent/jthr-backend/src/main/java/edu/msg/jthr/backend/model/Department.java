package edu.msg.jthr.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Department extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String departName;
	
	public Department() {}

	public Department(String departName) {
		super();
		this.departName = departName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	
	
}
