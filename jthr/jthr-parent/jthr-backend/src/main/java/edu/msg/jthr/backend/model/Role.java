package edu.msg.jthr.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String roleName;
	
	public Role() {}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return roleName;
	}
	
}
