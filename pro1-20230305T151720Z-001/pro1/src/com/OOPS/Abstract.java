package com.OOPS;

public abstract class Abstract 
{
	//abstract method
public abstract void VehicleModel();

//Regular Method
public void color()
{
	System.out.println("Blue color CAR");
}
}
class Honda extends Abstract
{
	public void VehicleModel()
	{
		System.out.print("Honda Amaze 2015 ");
	}
}

