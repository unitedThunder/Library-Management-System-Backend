package com.mzos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecutor {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee+"\t"+employee.hashCode());
		
		Employee employee1=(Employee) context.getBean("employee");
		System.out.println(employee1+"\t"+employee1.hashCode());
		
		Employee employee2=(Employee) context.getBean("employee");
		System.out.println(employee2+"\t"+employee2.hashCode());
		
		//	casting the context object so we can close context
		((ClassPathXmlApplicationContext) context).close();
	}

}
