package com.practice2;

public class method_to_find_the_smallest_number 
{
	/*
	 *by calling only the method in main body 
	void smallest()
	{
		int x=50;
		int y=100;
		int z=5;
		
		if(x<y && x<z)
		{
			
			System.out.println("\nSmallest Number is : "+x);
		}
		else if(y<x&&y<z)
		{
			
			System.out.println("\nSmallest Number is : "+y);
		}
		else
		{
			
			System.out.println("\nSmallest Number is : "+z);
		}
	}
	public static void main(String[] args) 
	{
		method_to_find_the_smallest_number smallestnumber = new method_to_find_the_smallest_number();
		smallestnumber.smallest();
	}
	
}
*/
	// by passing value to the method from main body
	static int smallestnumber(int x, int y , int z)
	{
		int smallest=0;
		if(x<y && x<z)
		{
			smallest =x;
			System.out.println("\nSmallest Number is : ");
		}
		else if(y<x&&y<z)
		{
			smallest = y;
			System.out.println("\nSmallest Number is : ");
		}
		else
		{
			smallest =z;
			System.out.println("\nSmallest Number is : ");
		}
		return smallest;
	}

	public static void main(String[] args) 
	{
		
         System.out.println(smallestnumber(50,80,42));
	}

}

