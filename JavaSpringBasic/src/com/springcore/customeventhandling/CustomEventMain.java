package com.springcore.customeventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventMain 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/customeventhandling/CustomEventHandling.xml");
		
		CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customeventpublisher");
		cep.publish();
		cep.publish();
	}

}
