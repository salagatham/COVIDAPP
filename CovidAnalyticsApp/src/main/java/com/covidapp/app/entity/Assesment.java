package com.covidapp.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="assesment")
public class Assesment {
	
	@Id
	@Column(name="assessment_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int assessment_id;
	
	@Column(name="contact")
	private String Contact;
	
	@Column(name="symptoms")
	private String symptoms;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="patient_id")
	private Patient patient;

	public int getassessment_id() {
		return assessment_id;
	}

	public void setassessment_id(int assessment_id) {
		this.assessment_id = assessment_id;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Assesment() {
	}
	
	

}
