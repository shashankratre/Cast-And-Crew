package com.springcore.javabased.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain {

	public static void main(String[] args) 
	{
           ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfiguration.class);
			/*
			 * Engine e1 = ac.getBean("enginedetails",Engine.class); System.out.println(e1);
			 * e1.power();
			 */
           Car c1 = ac.getBean("cardetails",Car.class);
           System.out.println(c1);
           c1.display();
          

	}

}
