package com.covidapp.app.service;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.covidapp.app.DAO.PatientDAO;
import com.covidapp.app.entity.Assesment;
import com.covidapp.app.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	
	private PatientDAO patientDAO;
	
	

	public PatientServiceImpl(PatientDAO patientdao) {
		patientDAO=patientdao;
	}

	@Override
	@Transactional
	public void register(Patient patient) {
		patientDAO.register(patient);

	}

	@Override
	public void assesment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void view_appointments() {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<Patient> list() {
		List<Patient> temp=patientDAO.list();
		return temp;
	}

	@Override
	@Transactional
	public String remove_patient(Patient patient) {
		String temp=patientDAO.remove_patient(patient);
		return temp;
		
	}

	@Override
	@Transactional
	public String take_assesment(int patient_id,Assesment assesment) {
		String temp=patientDAO.take_assesment(patient_id,assesment);
		return temp;
	}

}
