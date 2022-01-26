package com.covidapp.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapp.app.entity.Doctor;
import com.covidapp.app.entity.Patient;
import com.covidapp.app.service.DoctorService;
import com.covidapp.app.service.PatientService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	private DoctorService doctorService;
	private PatientService patientService;
	
	@Autowired
	public DoctorController(DoctorService docservice,PatientService patientser) {
		doctorService= docservice;
		patientService= patientser;
	}
	

	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@PostMapping("/register")
	public Doctor register(@RequestBody Doctor doc) {
		doc.setId(0);
		doctorService.register(doc);
		return doc;
		
	}
	
	@GetMapping("/patientlist")
	public List<Patient> list() {
		List<Patient> temp=patientService.list();
		return temp;
	}
	public void assesment_results() {
		
	}
	public void view_appointments() {
		
	}
	
	@DeleteMapping("/deletepatient")
	public String removePatient(@RequestBody Patient patient){
		String result=patientService.remove_patient(patient);
		return result;
	}
	

}
