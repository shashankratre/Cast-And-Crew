package com.springcore.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent> 
{

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) 
	{
                System.out.println("This is ContextStoppedEvent !!");		
	}

}
