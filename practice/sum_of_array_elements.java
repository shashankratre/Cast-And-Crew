package com.practice;

public class sum_of_array_elements 
{

	public static void main(String[] args) 
	{
		int[] x = {10,20,70,50,40,90,80,30,60};
		int sum =0;
		for(int i =0;i<x.length;i++)
		{
			//this can also be used to get sum of array elements 
		/*	 for(int j = i+1; j<x.length;j++)
			{
			x[i] += x[j];
			}
			 System.out.println("sum of array elements is " +x[i]);
		*/	  
			sum = sum +x[i];
		}
		 
		System.out.println("sum of array elements " +sum);
		
	}
}
