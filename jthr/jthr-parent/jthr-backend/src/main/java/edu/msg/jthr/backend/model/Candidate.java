package edu.msg.jthr.backend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

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
	@Column
	private String date;

	public Candidate(Long id, String lastName, String firstName,
			String telephone, String mobTelephone, String email,
			String address, Boolean relocation, String CV, String date) {
		super(id);
		this.lastName = lastName;
		this.firstName = firstName;
		this.telephone = telephone;
		this.mobTelephone = mobTelephone;
		this.email = email;
		this.address = address;
		this.relocation = relocation;
		this.CV = CV;
		this.date = date;
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

	public Candidate() {
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

}
