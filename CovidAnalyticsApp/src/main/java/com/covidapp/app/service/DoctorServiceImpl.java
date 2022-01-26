package com.covidapp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.covidapp.app.DAO.DoctorDAO;
import com.covidapp.app.entity.Doctor;
import com.covidapp.app.entity.Patient;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	private DoctorDAO doctorDAO;
	
	@Autowired
	public DoctorServiceImpl(DoctorDAO dao) {
		doctorDAO=dao;
	}

	@Override
	@Transactional
	public void register(Doctor doc) {
		doctorDAO.register(doc);

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
	public void removePatient() {
		// TODO Auto-generated method stub

	}

}
