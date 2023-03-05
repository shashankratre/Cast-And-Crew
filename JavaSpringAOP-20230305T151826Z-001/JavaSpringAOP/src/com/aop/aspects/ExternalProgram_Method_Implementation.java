package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ExternalProgram_Method_Implementation
{
// here we are creating an advisor ---advisor is basically a method to implement it before the actual method
	@Before("execution(* com.aop.services.HotelBookingImpl.hotelbooking())")//provide space after * otherwise gives error
	public void authentication()
//here we are creating an authentication method so that in our actual code it first verify the user before booking hotel 
	{
		System.out.println("Login to book hotel...");
	}
	
}
