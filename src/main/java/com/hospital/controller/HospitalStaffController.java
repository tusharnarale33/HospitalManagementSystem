package com.hospital.controller;

import java.util.List;

import javax.persistence.Entity;

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

import com.hospital.entity.HospitalStaff;
import com.hospital.service.HospitalStaffService;

@CrossOrigin("*")
@RestController
@RequestMapping("/hospitalStaff")
public class HospitalStaffController {
	
	@Autowired
	private HospitalStaffService hospitalStaffService;
	
	@PostMapping
	public String saveHospitalStaff(@RequestBody HospitalStaff h) {
		hospitalStaffService.saveHospitalStaff(h);
		return "successfully added.";
	}
	
	@GetMapping
	public List<HospitalStaff> selectAllHospitalStaff() {
		return hospitalStaffService.selectAllHospitalStaff();
		
	}
	
	@PutMapping
	public String updateHospitalStaff(@RequestBody HospitalStaff h) {
		hospitalStaffService.updateHospitalStaff(h);
		return "updated successfuly.";
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteHospitalStaffById(@PathVariable int id) {
		hospitalStaffService.deleteHospitalStaffByid(id);
		return "Delete Successfully.";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}









