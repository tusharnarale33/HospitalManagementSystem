package com.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Repository.PatientRepository;
import com.hospital.entity.Patient;
import com.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void savePatient(Patient p) {
		patientRepository.save(p);	
		
	}

	@Override
	public List<Patient> selectAllPatient() {
        return patientRepository.findAll();
	}

	@Override
	public void updatePatient(Patient p) {
		patientRepository.save(p);
	}

	@Override
	public void deletePatientById(int id) {
		patientRepository.deleteById(id);
	}

}
