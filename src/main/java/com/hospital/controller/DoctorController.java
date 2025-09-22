	package com.hospital.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.hospital.entity.Doctor;
import com.hospital.model.DoctorRequestDto;
import com.hospital.service.DoctorService;



@CrossOrigin("*")
@RestController
@RequestMapping("/Doctor")
public class DoctorController {
	
	@Autowired 
	private DoctorService doctorService;
	
	
	@PostMapping
	public String saveDoctor(@RequestBody DoctorRequestDto dto) {
		doctorService.saveDoctor(dto);
		return "success";
		
	}
	
	@GetMapping
	public List<Doctor> selectAllDoctor() {
		return doctorService.selectAllDoctor();
		
	}

	@PutMapping
	public String updateDoctor(@RequestBody Doctor d) {
		doctorService.updateDoctor(d);
		return "update";
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteDoctorById(@PathVariable int id) {
		doctorService.deleteDoctorById(id);
		return "delete";
	}
	
	
	
	
	
	

}
