package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospitalstaff",schema = "hospitalmanagement")
public class HospitalStaff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "staff_id")
	private int staffId;
	private String name;
	private int age;
	private String role;
	private String qualification;
	private String Phone;
    private String address;
    @Column(name = "shift_timing")
    private String shiftTiming;
    private double salary;
    @Column(name = "assigned_department")
    private String assignedDepartment;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShiftTiming() {
		return shiftTiming;
	}
	public void setShiftTiming(String shiftTiming) {
		shiftTiming = shiftTiming;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAssignedDepartment() {
		return assignedDepartment;
	}
	public void setAssignedDepartment(String assignedDepartment) {
		this.assignedDepartment = assignedDepartment;
	}
	
	//zero parameterized constructor
	public HospitalStaff() {
		super();
	}
	
	//parameterized constructer
	public HospitalStaff(int staffId, String name, int age, String role, String qualification, String phone,
			String address, String shifTiming, double salary, String assignedDepartment) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.age = age;
		this.role = role;
		this.qualification = qualification;
		Phone = phone;
		this.address = address;
		shifTiming = shifTiming;
		this.salary = salary;
		this.assignedDepartment = assignedDepartment;
	}
	
	
	
    
    

}
