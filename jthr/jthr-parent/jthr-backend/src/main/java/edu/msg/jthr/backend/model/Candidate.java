package edu.msg.jthr.backend.model;

import java.util.List;

public class Candidate {
	private int id;
	private String lastName;
	private String firstName;
	private String telephone;
	private String mobTelephone;
	private String address;
	private String CV;
	private String date;
	private List<String> comments;

	public Candidate(int id, String lastName, String firstName,
			String telephone, String mobTelephone, String address, String cV,
			String date, List<String> comments) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.telephone = telephone;
		this.mobTelephone = mobTelephone;
		this.address = address;
		CV = cV;
		this.date = date;
		this.comments = comments;
	}

	public Candidate() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

}
