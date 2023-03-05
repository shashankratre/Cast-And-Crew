package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		Student Student1 = (Student)context.getBean("Student1");
		System.out.println(Student1);
		Student Student2 = (Student)context.getBean("Student2");
		System.out.println(Student2);
		Student Student3 = (Student)context.getBean("Student3");
		System.out.println(Student3);
		
	}

}
