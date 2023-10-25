package com.mzos;

import java.util.List;
import java.util.Set;

public class Employee {

	private int empId;
	private String empName;
	private float empSal;
	private List<Address> address;
	private List<String> skill;
	private Set<String> certification;
	public Employee(int empId, String empName, float empSal, List<Address> address, List<String> skill,
			Set<String> certification) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.address = address;
		this.skill = skill;
		this.certification = certification;
	}
	public Set<String> getCertification() {
		return certification;
	}
	public void setCertification(Set<String> certification) {
		this.certification = certification;
	}
	public Employee(int empId, String empName, float empSal, Address address, List<String> skill) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.skill = skill;
	}
	public List<Address> getAddress() {
		return address;
	}
	public Employee(int empId, String empName, float empSal, List<Address> address, List<String> skill) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.address = address;
		this.skill = skill;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<String> getSkill() {
		return skill;
	}
	public void setSkill(List<String> skill) {
		this.skill = skill;
	}
	public Employee(int empId, String empName, float empSal, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", address=" + address
				+ ", skill=" + skill + ", certification=" + certification + "]";
	}
	
}
