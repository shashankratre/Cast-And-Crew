package com.OOPS;

public class Runtimepolymorphism //achieved by overriding
{
	public void display()
	{
		System.out.println("Parent class Method");
	}
}
class runtime extends Runtimepolymorphism
{
	public void display()
	{
		System.out.println("Child class Method");
		
	}

}
