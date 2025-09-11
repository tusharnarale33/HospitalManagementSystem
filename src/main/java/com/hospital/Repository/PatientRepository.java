package com.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Doctor;
import com.hospital.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient , Integer> {

}
