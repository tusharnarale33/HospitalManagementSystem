package com.hospital.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.entity.HospitalStaff;
import com.hospital.model.HospitalStaffRequestDto;

@Component
public class HospitalStaffMapper {
	
	@Autowired
    private ModelMapper modelmapper;	
	
	public HospitalStaff toEntity(HospitalStaffRequestDto dto) {
		return modelmapper.map(dto, HospitalStaff.class);
		
	}
	public HospitalStaffRequestDto toDto(HospitalStaff h) {
		return modelmapper.map(h, HospitalStaffRequestDto.class);
	}

}
