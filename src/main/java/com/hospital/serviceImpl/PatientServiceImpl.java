package com.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Repository.PatientRepository;
import com.hospital.entity.Patient;
import com.hospital.mapper.PatientMapper;
import com.hospital.model.PatientRequestDto;
import com.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientMapper patientMapper;

	@Override
	public PatientRequestDto savePatient(PatientRequestDto dto) {
		Patient patient=patientMapper.toEntity(dto);
		
		Patient patient2=patientRepository.save(patient);
		
		PatientRequestDto patientRequestDto=patientMapper.toDto(patient2);
		return patientRequestDto;
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
