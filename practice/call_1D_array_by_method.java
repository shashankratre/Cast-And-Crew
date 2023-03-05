package com.practice;
public class call_1D_array_by_method 
{
	static int display(int... input) // method to call 1D array
	{
		System.out.printf("%15s\n", "Number");  
		for(int i =0;i<input.length;i++)
		{
			System.out.printf("%15s\n", input[i]);
		}
		return 0;
	}
	public static void main(String[] args) 
	{    
          display(new int[] {1,2,3,4,5,89,74,25,100}); //initialize and call array method
	}
}
