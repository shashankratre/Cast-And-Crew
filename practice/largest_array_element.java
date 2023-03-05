package com.practice;

public class largest_array_element 
{
	public static void main(String[] args) 
	{
	int[] x = {4500,25,63,95,455505,74,2000,650};
	int max =x[0];//we can use any index to get largest number in array elements
	System.out.println("Largest Array Element is : ");
	 for(int i=0; i<x.length;i++)
	{
		//Logic for largest array elements 
		if(max<x[i])
		{
			max = x[i];
		}
	}
	System.out.println(max);
    }
}
