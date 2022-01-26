package com.covidapp.app.service;

import java.util.List;
import com.covidapp.app.entity.Assesment;
import com.covidapp.app.entity.Patient;

public interface PatientService {
	public void register(Patient patient);
	public void assesment();
	public void view_appointments();
	public List<Patient> list();
	public String remove_patient(Patient patient);
	public String take_assesment(int patient_id,Assesment assesment);
}
