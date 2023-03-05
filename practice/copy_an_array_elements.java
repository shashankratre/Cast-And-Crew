package com.practice;

import java.util.Arrays;
//copy_an_array_elements 
public class copy_an_array_elements 
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,4,5,6};
		
		int[] y = new int[x.length];
		/*	// SIMPLE LOGIC TO COPY  ARRAY ELEMENTS OF GIVEN ARRAY INTO ANOTHER ARRAY
		int[] y = x;
		for(int i =0; i<x.length;i++)
		{
			System.out.println(y[i]);
		}
*/
		// SAME THING USING METHOD
		System.arraycopy(x, 0, y, 1, 5); //this will copy all the elements of first array (x) starting from zero index upto five(5) elements 
		//in second array starting from first index(1)
		//System.arraycopy(x, 0, y, 0, x.length);
		System.out.println("y = " + Arrays.toString(y));
	}
}
