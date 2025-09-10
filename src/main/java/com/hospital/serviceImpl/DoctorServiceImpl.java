package com.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Repository.DoctorRepository;
import com.hospital.entity.Doctor;
import com.hospital.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void saveDoctor(Doctor d) {
		doctorRepository.save(d);
		
	}

	@Override
	public void updateDoctor(Doctor d) {
		doctorRepository.save(d);
		
	}

	@Override
	public List<Doctor> selectAllDoctor() {
       return doctorRepository.findAll();		
	}

	@Override
	public void deleteDoctorById(int id) {
		doctorRepository.deleteById(id);
	}

}
