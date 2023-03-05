package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/collections/collection.xml");
		Employee e1 = (Employee)ac.getBean("EMPLOYEEDETAILS");
		System.out.println(e1);
		
	}

}
