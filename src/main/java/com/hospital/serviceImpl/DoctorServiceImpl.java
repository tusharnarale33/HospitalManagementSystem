package com.hospital.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospital.Repository.DoctorRepository;
import com.hospital.entity.Doctor;
import com.hospital.service.DoctorService;

public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void saveDoctor(Doctor d) {
		doctorRepository.save(d);
		
	}

}
