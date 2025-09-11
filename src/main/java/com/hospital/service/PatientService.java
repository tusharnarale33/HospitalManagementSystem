package com.hospital.service;

import java.util.List;

import com.hospital.entity.Patient;

public interface PatientService {

	void savePatient(Patient p);

	public List<Patient> selectAllPatient();

	public void updatePatient(Patient p);

    public	void deletePatientById(int id);

}
