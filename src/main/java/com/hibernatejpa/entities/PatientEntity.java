package com.hibernatejpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class PatientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "last_four_ssn ")
	private String last_four_ssn;

	@Column(name = "dob")
	private Date dob;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLast_four_ssn() {
		return last_four_ssn;
	}

	public void setLast_four_ssn(String last_four_ssn) {
		this.last_four_ssn = last_four_ssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", last_four_ssn=" + last_four_ssn + ", dob=" + dob + "]";
	}

}
