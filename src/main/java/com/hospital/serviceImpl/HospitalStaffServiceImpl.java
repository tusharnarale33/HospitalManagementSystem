package com.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hospital.Repository.HospitalStaffRepository;
import com.hospital.entity.HospitalStaff;
import com.hospital.mapper.HospitalStaffMapper;
import com.hospital.model.HospitalStaffRequestDto;
import com.hospital.service.HospitalStaffService;

@Service
public class HospitalStaffServiceImpl implements HospitalStaffService{
	
	@Autowired
	private HospitalStaffRepository hospitalStaffRepository;
	
	@Autowired
	private HospitalStaffMapper hospitalStaffMapper;

	@Override
	public HospitalStaffRequestDto saveHospitalStaff(HospitalStaffRequestDto dto) {
		HospitalStaff hospitalStaff=hospitalStaffMapper.toEntity(dto);
		HospitalStaff hospitalStaff2=hospitalStaffRepository.save(hospitalStaff);
		HospitalStaffRequestDto hospitalStaffRequestDto=hospitalStaffMapper.toDto(hospitalStaff2);
		return hospitalStaffRequestDto;
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
