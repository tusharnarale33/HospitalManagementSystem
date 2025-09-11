package com.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hospital.Repository.HospitalStaffRepository;
import com.hospital.entity.HospitalStaff;
import com.hospital.service.HospitalStaffService;

@Service
public class HospitalStaffServiceImpl implements HospitalStaffService{
	
	@Autowired
	private HospitalStaffRepository hospitalStaffRepository;

	@Override
	public void saveHospitalStaff(HospitalStaff h) {
			hospitalStaffRepository.save(h);
	}

	@Override
	public List<HospitalStaff> selectAllHospitalStaff() {
		return hospitalStaffRepository.findAll();
		
	}

	@Override
	public void updateHospitalStaff(HospitalStaff h) {
        hospitalStaffRepository.save(h);
		
	}

	@Override
	public void deleteHospitalStaffByid(int id) {
		hospitalStaffRepository.deleteById(id);
	}
	

}
