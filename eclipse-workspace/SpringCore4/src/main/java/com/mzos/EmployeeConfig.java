package com.mzos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean(name = "emp")
	public Employee getEmployee() {
		return new Employee(101,"Hemant",100000);
	}
	
	@Bean(name = "add")
	public Address getAddress() {
		return new Address("Nashik","Maharashtra",422004);
	}
	
	@Bean(name = "emp1")
	public Employee getEmployee1() {
		Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setEmpName("Bhushan");
		emp.setEmpSal(200000);
		return emp;
	}
}
