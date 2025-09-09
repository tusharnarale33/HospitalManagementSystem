package com.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Doctor;

public interface PatientRepository extends JpaRepository<Doctor , Integer> {

}
