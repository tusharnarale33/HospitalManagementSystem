package com.hospital.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.entity.Doctor;
import com.hospital.model.DoctorRequestDto;



@Component
public class DoctorMapper {
	
	@Autowired
	private ModelMapper modelMapper;

	public Doctor toEntity(DoctorRequestDto dto) {
		return modelMapper.map(dto , Doctor.class);
	}

	public DoctorRequestDto toDto(Doctor doctor2) {
		return modelMapper.map(doctor2, DoctorRequestDto.class);
	}
	

}
