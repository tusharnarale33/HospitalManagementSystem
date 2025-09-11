package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospital.entity.HospitalStaff;

public interface HospitalStaffService {
	
     public void saveHospitalStaff(HospitalStaff h);

	 public List<HospitalStaff> selectAllHospitalStaff();	
	 
	 public void updateHospitalStaff(HospitalStaff h);

	 public void deleteHospitalStaffByid(int id);
	

}
