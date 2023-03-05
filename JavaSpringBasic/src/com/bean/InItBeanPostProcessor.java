package com.bean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InItBeanPostProcessor implements BeanPostProcessor
{
	int x = 10;
	int y =40;
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException 
	{
		
		
		System.out.println("After Initialization : " + beanname);
		int a = y-x;
		System.out.println(a);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException 
	{
		
		
		System.out.println("Before Initialization : "+beanname);
		int z = x+y;
		System.out.println(z);
		return bean;
	}

}
