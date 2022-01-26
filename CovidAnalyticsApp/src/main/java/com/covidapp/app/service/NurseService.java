package com.covidapp.app.service;

import com.covidapp.app.entity.Nurse;
import com.covidapp.app.entity.Patient;

public interface NurseService {
	public void register(Nurse nurse);
	public Patient list();
	public void assesment_results();
	public void view_appointments();
	public void assigning_patient_to_doc();
	public void removePatient();
}
