package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospital.entity.HospitalStaff;
import com.hospital.model.HospitalStaffRequestDto;

public interface HospitalStaffService {
	
     public HospitalStaffRequestDto saveHospitalStaff(HospitalStaffRequestDto dto);

	 public List<HospitalStaff> selectAllHospitalStaff();	
	 
	 public void updateHospitalStaff(HospitalStaff h);

	 public void deleteHospitalStaffByid(int id);
	

}
