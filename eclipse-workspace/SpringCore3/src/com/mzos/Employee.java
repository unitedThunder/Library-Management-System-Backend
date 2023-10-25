package com.mzos;
public class Employee {
	
	private String empName;
	private int empId;
	private float empSal;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public Employee(String empName, int empId, float empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "]";
	}
	

}
