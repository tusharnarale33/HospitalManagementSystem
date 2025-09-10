package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "doctor" ,schema = "hospitalmanagement")
public class Doctor {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doctor_id")
	private int doctorId;
	private String name;
	private String gender;
	private int age;
	private String phone;
	private String email;
	private String specialization;
	private String qualification;
	private String address;
	private String department;
	private String experience;
	@Column(name = "consultation_fee")
	private float consultationFee;
	@Column(name = "available_days")
	private String availableDays;
	@Column(name = "available_time")
	private String availableTime;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public float getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(float consultationFee) {
		this.consultationFee = consultationFee;
	}
	public String getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	public String getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}
	
	//Zero parameter constructor
	public Doctor() {
		super();
	}
	
	//Paratmeterized Constructer
	public Doctor(int doctorId, String name, String gender, int age, String phone, String email, String specialization,
			String qualification, String address, String department, String experience, float consultationFee,
			String availableDays, String availableTime) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.specialization = specialization;
		this.qualification = qualification;
		this.address = address;
		this.department = department;
		this.experience = experience;
		this.consultationFee = consultationFee;
		this.availableDays = availableDays;
		this.availableTime = availableTime;
	}
	
	
	
	
	
	
	
}
