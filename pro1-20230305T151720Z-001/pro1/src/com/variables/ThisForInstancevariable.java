package com.variables;

public class ThisForInstancevariable 
{
	String color;
	int model;
	float price;
	 ThisForInstancevariable(String color,int model, float price) //constructor
	{
		this.color=color;
		this.model=model;
		this.price=price;
	}
	void show()
	{
		System.out.println(color +" "  +model+ " "  +  price);
		
	}
	

	public static void main(String[] args) 
	{
		ThisForInstancevariable attributes = new  ThisForInstancevariable("red", 2022, 1265460);
	
		attributes.show();

	}

}
