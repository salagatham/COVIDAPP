package com.covidapp.app.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.covidapp.app.entity.Assesment;
import com.covidapp.app.entity.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {
	
	private EntityManager entityManager;
	
	
	@Autowired
	public PatientDAOImpl(EntityManager em) {
		entityManager=em;
	}

	@Override
	public void register(Patient patient) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(patient);
		
	}

	@Override
	public void view_appointments() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void assesment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Patient> list() {
		Session session=entityManager.unwrap(Session.class);
		List<Patient> temp=session.createQuery("from Patient").getResultList();
		return temp;
	}

	@Override
	public String remove_patient(Patient patient) {
		Session session=entityManager.unwrap(Session.class);
		session.createQuery("delete from Patient where id=: id").setParameter("id", patient.getPatient_id()).executeUpdate();
		return patient.getFirst_name()+" with id "+ patient.getPatient_id()+" is deleted";
		
	}

	@Override
	public String take_assesment(int patient_id, Assesment assesment) {
		// TODO Auto-generated method stub
		return null;
	}

}
