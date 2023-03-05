package com.springcore.autowiring.annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain
{

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotations/autowired/autowire_Annotationconfig.xml");
		School s1= ac.getBean("schooldetails", School.class);
	//	Student s1= ac.getBean("studentdetails", Student.class);//to see bean(studentdetails) values of Student class
		System.out.println(s1);

	}

}
