package com.covidapp.app.DAO;

import java.util.List;

import com.covidapp.app.entity.Assesment;
import com.covidapp.app.entity.Patient;

public interface PatientDAO {
	public void register(Patient patient);
	public void assesment();
	public void view_appointments();
	public List<Patient> list();
	public String remove_patient(Patient patient);
	public String take_assesment(int patient_id,Assesment assesment);
}
