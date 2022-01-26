package com.covidapp.app.DAO;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.covidapp.app.entity.Doctor;
import com.covidapp.app.entity.Patient;

@Repository
public class DoctorDAOImpl implements DoctorDAO {
	
	private EntityManager entityManager;
	
	
	@Autowired
	public DoctorDAOImpl(EntityManager em) {
		entityManager=em;
	}

	@Override
	public void register(Doctor doc) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(doc);
	
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
