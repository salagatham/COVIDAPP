package com.covidapp.app.service;

import org.springframework.stereotype.Service;

import com.covidapp.app.DAO.NurseDAO;
import com.covidapp.app.entity.Nurse;
import com.covidapp.app.entity.Patient;

@Service
public class NurseServiceImpl implements NurseService {
	
	private NurseDAO nurseDAO;

	public NurseServiceImpl(NurseDAO nursedao) {
		nurseDAO=nursedao;
	}

	@Override
	public void register(Nurse nurse) {
		nurseDAO.register(nurse);

	}

	@Override
	public Patient list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assesment_results() {
		// TODO Auto-generated method stub

	}

	@Override
	public void view_appointments() {
		// TODO Auto-generated method stub

	}

	@Override
	public void assigning_patient_to_doc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePatient() {
		// TODO Auto-generated method stub

	}

}
