package com.springcore.javabased.annotations;

public class Car 
{
	private Engine engine;

	public Engine getEngine() 
	{
		return engine;
	}

	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	public void display()
	{
		this.engine.power();
	}
	

}
