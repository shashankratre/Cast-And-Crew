package com.springcore.customeventhandling;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent
{

	public CustomEvent(Object source) 
	{
		super(source);// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "This is my custom event";
	}

}
