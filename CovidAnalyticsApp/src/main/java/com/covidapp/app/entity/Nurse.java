package com.covidapp.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nurse")
public class Nurse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String first_name; 
	@Column(name="address")
	private String address;
	@Column(name="dob")
	private String dob;
	@Column(name="phone_number")
	private long phone_number;
	@Column(name="email")
	private String email;
	
	public Nurse() {
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public long getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Nurse(int id, String first_name, String address, String dob, long phone_number, String email) {
		
		this.id = id;
		this.first_name = first_name;
		this.address = address;
		this.dob = dob;
		this.phone_number = phone_number;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nurse [id=" + id + ", first_name=" + first_name + ", address=" + address + ", dob=" + dob
				+ ", phone_number=" + phone_number + ", email=" + email + "]";
	}
	
	
	
	
}
