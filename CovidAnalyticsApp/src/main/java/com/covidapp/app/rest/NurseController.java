package com.covidapp.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapp.app.entity.Nurse;
import com.covidapp.app.entity.Patient;
import com.covidapp.app.service.NurseService;
import com.covidapp.app.service.PatientService;

@RestController
@RequestMapping("/nurse")
public class NurseController {
	private NurseService nurseService;
	private PatientService patientService;
	
	@Autowired
	public NurseController(NurseService nurse,PatientService patientser) {
		nurseService=nurse;
		patientService=patientser;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello from Nurse";
	}
	
	@PostMapping("/register")
	public Nurse register(@RequestBody Nurse nurse) {
		nurse.setId(0);
		nurseService.register(nurse);
		return nurse;
		
	}
	
	@GetMapping("/patientlist")
	public List<Patient> list() {
		List<Patient> temp=patientService.list();
		return temp;
	}
	
	@DeleteMapping("/deletepatient")
	public String removePatient(@RequestBody Patient patient){
		String result=patientService.remove_patient(patient);
		return result;
	}
}
