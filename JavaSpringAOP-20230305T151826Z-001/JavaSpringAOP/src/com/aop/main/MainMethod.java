package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.HotelBooking;

public class MainMethod 
{

	public static void main(String[] args) 
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/main/aopconfig.xml");
	HotelBooking HB = context.getBean("hotelbookingimpl",HotelBooking.class);
	HB.hotelbooking();
	
	}

}
