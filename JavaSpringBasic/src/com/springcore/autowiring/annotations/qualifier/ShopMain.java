package com.springcore.autowiring.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopMain {

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotations/qualifier/qualifier_Annotationconfig.xml");
		Shop s1= ac.getBean("shopdetails", Shop.class);
		System.out.println(s1);

	}

}
