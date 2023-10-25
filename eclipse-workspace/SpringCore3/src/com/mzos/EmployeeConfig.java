package com.mzos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class EmployeeConfig {

	@Bean (name = "emp")
	public Employee getEmployee() {
		
		return new Employee("Hemant",101,100000);
	}
}
