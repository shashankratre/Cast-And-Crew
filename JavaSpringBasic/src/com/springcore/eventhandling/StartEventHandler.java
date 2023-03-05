package com.springcore.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent>
{

	@Override
	public void onApplicationEvent(ContextStartedEvent event)
	{
		System.out.println("This is ContextStartedEvent !!");
		
	}

}
