package com.springcore.autowiring.annotations.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotations/required/required_Annotationconfig.xml");
        Employee e = ac.getBean("employeedetails", Employee.class);
        System.out.println(e);
	}

}
