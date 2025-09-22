package com.hospital.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.entity.Patient;
import com.hospital.model.PatientRequestDto;

@Component
public class PatientMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Patient toEntity(PatientRequestDto dto) {
		return modelMapper.map(dto, Patient.class);
		
		}
	
	public PatientRequestDto toDto(Patient patient2) {
		return modelMapper.map(patient2, PatientRequestDto.class );
       		
	}
	
	
	

}
