package com.covidapp.app.DAO;

import com.covidapp.app.entity.Doctor;
import com.covidapp.app.entity.Patient;

public interface DoctorDAO {
	public void register(Doctor doc);
	public Patient list();
	public void assesment_results();
	public void view_appointments();
	public void removePatient();
}
