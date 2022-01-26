package com.covidapp.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.covidapp.app.entity.Patient;
import com.covidapp.app.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	private PatientService patientService;
	
	@Autowired
	public PatientController(PatientService patient) {
		patientService=patient;
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello from Patient";
	}
	
	@PostMapping("/register")
	public Patient register(@RequestBody Patient patient) {
		patient.setPatient_id(0);
		patientService.register(patient);
		return patient;
		
	}
	
	
	
}
