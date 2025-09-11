package com.hospital.controller;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Patient;
import com.hospital.service.PatientService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping
	public String savePatient(@RequestBody Patient p) {
		patientService.savePatient(p);
		return "Added Successfully";
	}
	
	@GetMapping
	public List<Patient> selectAllPatient(){
		return patientService.selectAllPatient();
	}
	
	@PutMapping
	public String updatePatient(@RequestBody Patient p) {
	 patientService.updatePatient(p);	
	 return "updated";
	
	}
	
	@DeleteMapping("/id/{id}")
	public String deletePatientById(@PathVariable int id) {
		patientService.deletePatientById(id);
		return "deleted";
	}
	
	

}
