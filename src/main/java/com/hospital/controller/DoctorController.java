package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Doctor;
import com.hospital.service.DoctorService;


@CrossOrigin("*")
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired 
	private DoctorService doctorService;
	
	
	@PostMapping
	public String saveDoctor(@RequestBody Doctor d) {
		doctorService.saveDoctor(d);
		return "success";
		
	}
	
	
	
	
	

}
