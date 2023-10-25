package com.mzos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecutor {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Employee e = (Employee) context.getBean("emp1");
		System.out.println(e);
	}

}
