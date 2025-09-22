package com.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Doctor;
import com.hospital.model.DoctorRequestDto;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

	Doctor save(DoctorRequestDto d);


	
	

}
