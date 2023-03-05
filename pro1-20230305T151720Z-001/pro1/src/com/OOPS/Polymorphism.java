package com.OOPS;

class Vehicle
{
	void model()
	{
		System.out.println("This vehicle is old model");
	}
}
class Truck extends Vehicle
{
	void model()
	{
		System.out.println("The Truck Model is 2015");
	}
}
class Train extends Vehicle
{
	void model()
	{
		System.out.println("The train was built in 2000 and model is 2001");
	}
}
public class Polymorphism 
{

	public static void main(String[] args) 
	{
		Vehicle veh = new Vehicle(); // //Creating vehicle object using Vehicle class
		Vehicle tru = new Truck(); //Creating truck object using Vehicle class
		//polymorphism in OOP occurs when a parent class reference(Vehicle class) is used to refer to a child(Truck and Train) class object.
		Vehicle tra = new Train();//Creating train object using Vehicle class
		veh.model();
		tru.model();
		tra.model();
	}

}
