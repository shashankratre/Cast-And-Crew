package com.practice;

public class exception 
{

	public static void main(String[] args) 
	{
		try
		{
			int[] x = {1,2,6,5,3};
			System.out.println("access element six "+ x[10]);
		}
		catch(Exception e1)
		{
			System.out.println("Array index out of bound " + e1);
		}
		//System.out.println("out of bound ");
	}

}
