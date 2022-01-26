package com.covidapp.app.service;

import com.covidapp.app.entity.Doctor;
import com.covidapp.app.entity.Patient;

public interface DoctorService {
	public void register(Doctor doc);
	public Patient list();
	public void assesment_results();
	public void view_appointments();
	public void removePatient();

}
