package com.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beaninheritance/beaninheritance.xml");
		Employee e =(Employee)ac.getBean("AMAZON_EMPLOYEE");
		e.getName1();
		e.getName2();
		e.getName3();
		NewEmployee e1 = (NewEmployee)ac.getBean("GOOGLE_EMPLOYEE");
		e1.getName1();
		e1.getName2();
		e1.getName3();
		e1.getName4();
		

	}

}
