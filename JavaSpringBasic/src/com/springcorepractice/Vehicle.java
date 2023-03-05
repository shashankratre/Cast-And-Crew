package com.springcorepractice;

public class Vehicle
{
	private String name;
	private int model;
	private int price;
	
	
	//SETTERS -  set all the values details (like mercedes, 320, etc available in the xml configuration) NOTE - (irrespective of the bean is called or not) 
	//of variable(like name, model etc in class structure) and return the value details when a bean(vehicle1,vehicle2,vehicle3 etc in this case) is called(through sys out) in the main class. 
	public void setName(String name) 
	{
		//System.out.println("vehicle name set " +name);
		this.name = name;
	}
	public void setModel(int model) 
	{
		//System.out.println("vehicle model set "+model);
		this.model = model;
	}
	public void setPrice(int price) 
	{
		//System.out.println("vehicle price set "+price);
		this.price = price;
	}
	//GETTERS- get all the values from the xml configuration and send the value details to the Setter method
	public String getName() 
	{
		//System.out.println("vehicle name get " + name);
		return name;
	}
	public int getModel() 
	{
		return model;
	}
	public int getPrice() 
	{
		return price;
	}
	public Vehicle() 
	{
		super();
	}
	@Override 
	public String toString() //it returns the object details(like name,model,price) to the main class, 
	                         //when a bean (vehicle1,vehicle2,vehicle3 etc in this case) is called (through sys out) in main class
	{
		return "Veicle Name : " + name + ",\nVehicle Model: " + model + ",\nVehicle Price : " + price;
	}
	
}
