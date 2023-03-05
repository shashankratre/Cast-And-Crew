package com.springcorepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleMain 
{
	

	public static void main(String[] args) 
	{
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcorepractice/vehicle.xml");
		Vehicle v1 =(Vehicle)ac.getBean("vehiclelist1");
		System.out.println("Details Of Vehicle List 1 : \n" + v1);
		
		Vehicle v2 =(Vehicle)ac.getBean("vehiclelist2");
		System.out.println("\nDetails of Vehicle List 2 : \n" + v2);
	
		Vehicle v3 =(Vehicle)ac.getBean("vehiclelist3");
		System.out.println("\nDetails Of Vehicle List 3 : \n" + v3);
		
		Vehicle v4 =(Vehicle)ac.getBean("vehiclelist4");
		System.out.println("\nDetails of Vehicle List 4 : \n" + v4);


		Vehicle v5 =(Vehicle)ac.getBean("vehiclelist5");
		System.out.println("\nDetails Of Vehicle List 5 : \n" + v5);
		
		Vehicle v6 =(Vehicle)ac.getBean("vehiclelist6");
		System.out.println("\nDetails of Vehicle List 6 : \n" + v6);
		
		Vehicle v7 =(Vehicle)ac.getBean("vehiclelist7");
		System.out.println("\nDetails Of Vehicle List 7 : \n" + v7);
		
		Vehicle v8 =(Vehicle)ac.getBean("vehiclelist8");
		System.out.println("\nDetails of Vehicle List 8 : \n" + v8);
		
		Vehicle v9 =(Vehicle)ac.getBean("vehiclelist9");
		System.out.println("\nDetails Of Vehicle List 9 : \n" + v9);
		
		Vehicle v10 =(Vehicle)ac.getBean("vehiclelist10");
		System.out.println("\nDetails of Vehicle List 10 : \n" + v10);
	   
		
	}

}
