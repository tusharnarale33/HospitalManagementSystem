package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Repository.DoctorRepository;
import com.hospital.entity.Doctor;


@Service
public interface DoctorService {
	
	
	public void saveDoctor(Doctor d);
	

}
