package com.springcore.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingMain {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/eventhandling/EventHandling.xml");
		
		context.start();
		
		EventHandling eh = (EventHandling) context.getBean("eventhandling");
		eh.getMessage();
		context.stop();
	}

}
