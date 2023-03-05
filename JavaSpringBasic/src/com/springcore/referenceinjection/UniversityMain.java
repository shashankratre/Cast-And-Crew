package com.springcore.referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityMain {

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/referenceinjection/referenceconfig.xml");
		University u = (University)ac.getBean("universityinformation");
	
		System.out.println(u);

	}

}
