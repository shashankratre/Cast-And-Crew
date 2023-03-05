package com.springcore.customeventhandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware
{
	private  ApplicationEventPublisher eventpublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher eventpublisher) 
	{
		this.eventpublisher = eventpublisher;
		
	}
	
	public void publish() 
	{
		CustomEvent ce = new CustomEvent(this);
		eventpublisher.publishEvent(ce);
		
	}
}
