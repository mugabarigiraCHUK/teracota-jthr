package edu.msg.jthr.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends BaseEntity{
	
	
	private static final long serialVersionUID = 1L;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String phoneNumber;
	@Column
	private String mobilePhoneNumber;
	@Column
	private String email;
	@Column
	private String jobPozition;
	@Column
	private String description;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private List<String> roles = new ArrayList<String>();
	
	public User() {}
	
	public User(Long userID, String firstName, String lastName, String phoneNumber,
			String mobilePhoneNumber, String email, String jobPozition,
			String description, String username, String password) {
		
		super(userID);
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.email = email;
		this.jobPozition = jobPozition;
		this.description = description;
		this.username = username;
		this.password = password;
	}
	
	public User(String firstName, String lastName, String phoneNumber,
			String mobilePhoneNumber, String email, String jobPozition,
			String description, String username, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.email = email;
		this.jobPozition = jobPozition;
		this.description = description;
		this.username = username;
		this.password = password;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobPozition() {
		return jobPozition;
	}

	public void setJobPozition(String jobPozition) {
		this.jobPozition = jobPozition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addRole(String role) {
		roles.add(role);
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id= "+getId()+" firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", mobilePhoneNumber="
				+ mobilePhoneNumber + ", email=" + email + ", jobPozition="
				+ jobPozition + ", description=" + description + ", username="
				+ username + ", password=" + password + ", roles=" + roles
				+ "]";
	}
	

}

