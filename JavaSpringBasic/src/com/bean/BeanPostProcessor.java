package com.bean;

public class BeanPostProcessor 
{

	private String message;
	
	public void setMessage(String message) 
	{
		this.message = message;
	}
	public void getMessage() 
	{
		System.out.println("My Message : " + message);
	}
	
 public void init()
 {
	 System.out.println("This is initialization method !! it will be printed First ");
 }
	 
public void destroy() 
{
	System.out.println("This is destroy Method !! it will be printed at Last ");
}
}
