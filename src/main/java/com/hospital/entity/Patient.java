package com.hospital.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "patient",schema = "hospitalmanagement")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_id")
	private int patientId;
	private String name;
	private String gender;
	private int age;
	private String email;
	private String phone;
	private String address;
	private String disease;
	@Column(name = "admit_date")
	private Date admitDate;
	@Column(name = "discharge_date")
	private Date dischargeDate;
	@Column(name = "assigned_doctorid")
	private int assignedDoctorId;
	@Column(name = "room_number")
	private int roomNumber;
	private boolean status;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Date getAdmitDate() {
		return admitDate;
	}
	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}
	public Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	public int getAssignedDoctorId() {
		return assignedDoctorId;
	}
	public void setAssignedDoctorId(int assignedDoctorId) {
		this.assignedDoctorId = assignedDoctorId;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	//Zero parameterized constructor
	public Patient() {
		super();
	}
	
	//parameterized contructor
	public Patient(int patienbtId, String name, String gender, int age, String email, String phone, String address,
			String disease, Date admitDate, Date dischargeDate, int assignedDoctorId, int roomNumber, boolean status) {
		super();
		this.patientId = patienbtId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.disease = disease;
		this.admitDate = admitDate;
		this.dischargeDate = dischargeDate;
		this.assignedDoctorId = assignedDoctorId;
		this.roomNumber = roomNumber;
		this.status = status;
	}
	
	
	
	
	
	

}
