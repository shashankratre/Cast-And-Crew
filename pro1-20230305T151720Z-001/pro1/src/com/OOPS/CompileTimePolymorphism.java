package com.OOPS;

public class CompileTimePolymorphism 
{
	static int add(int x,int y)
	{
		return x+y;
	}	
	static double add(double x ,double y ) //method overloading because same method name 
	{
		return x+y;
	}

	public static void main(String[] args) 
	{
		System.out.print(add(50,10));
		System.out.print("   ");
		System.out.print(add(50.3,10.2));
	}

}
