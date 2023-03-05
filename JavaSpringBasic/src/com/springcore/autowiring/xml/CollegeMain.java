package com.springcore.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {

	public static void main(String[] args) 
	{
	ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/autowiring/xml/autowire_XmlConfig.xml");
	College c = ac.getBean("collegebean", College.class);// we r using type casting using College.Class
	System.out.println(c);
	

	}

}
