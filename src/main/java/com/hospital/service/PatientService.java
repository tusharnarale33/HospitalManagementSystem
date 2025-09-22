package com.hospital.service;

import java.util.List;

import com.hospital.entity.Patient;
import com.hospital.model.PatientRequestDto;

public interface PatientService {

	PatientRequestDto savePatient(PatientRequestDto dto);

	public List<Patient> selectAllPatient();

	public void updatePatient(Patient p);

    public	void deletePatientById(int id);

}
