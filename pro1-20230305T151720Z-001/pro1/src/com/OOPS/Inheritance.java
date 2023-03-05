package com.OOPS;

public class Inheritance 
{
	int z;
	void add(int x, int y)
	{
		 z= x+y;
		System.out.println(z);
	}
	void sub(int x, int y)
	{
		z= x-y;
		System.out.println(z);
	}
public static class Inheritance2 extends Inheritance
{
	void mul(int x, int y)
	{
		 z= x*y;
		System.out.println(z);
	}
	void div(int x, int y)
	{
		 z= x/y;
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
	Inheritance2 inherit = new Inheritance2();
	inherit.add(a,b);
	inherit.sub(a,b);
	inherit.mul(a,b);
	inherit.div(a,b);
	

	}

}
}
