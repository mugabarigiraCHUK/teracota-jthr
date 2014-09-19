package edu.msg.jthr.web.user;

public class User {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String mobilePhoneNumber;
	private String email;
	private String jobPozition;
	private String description;

	public User() {}
	
	public User( String firstName, String lastName, String phoneNumber,
			String mobilePhoneNumber, String email, String jobPozition,
			String description) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.email = email;
		this.jobPozition = jobPozition;
		this.description = description;

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
	
}
