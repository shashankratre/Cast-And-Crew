package com.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMain 
{

	public static void main(String[] args) 
	{
	AbstractApplicationContext aac = new ClassPathXmlApplicationContext("com/bean/BPP.xml");
	BeanPostProcessor bpp =(BeanPostProcessor)aac.getBean("BPP");
	bpp.getMessage();
	aac.registerShutdownHook();
	aac.close();

	}

}
