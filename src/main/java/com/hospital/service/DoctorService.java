package com.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.Repository.DoctorRepository;
import com.hospital.entity.Doctor;

import net.bytebuddy.asm.Advice.Return;


public interface DoctorService {
	
	
	public void saveDoctor(Doctor d);
	
	public void updateDoctor(Doctor d);
	
	public List<Doctor> selectAllDoctor();
	
	public void deleteDoctorById(int id);

}
