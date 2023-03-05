package com.practice;

public class sum_of_two_array_elements 
{
	// sum of two array elements
		public static void main(String[] args) 
		{
	int[] x = {1,5,3};
	int[] y = {3,2,6};
	int sum = 0;
	System.out.println("Sum of two array elements is :");
	for (int i =0;i<x.length;i++)
	{
		for(int j =0;j<y.length;j++)
		{
			//sum = x[i] + y[j];// to add each elements of first array to each elements in second array put "y[j]" {1+3,1+2,1+6,5+3,5+2,5+6,3+3,3+2,3+6}
			sum = x[i] + y[i];// to add single element of first array to single element of second array put "y[i]" {1+3,5+2,3+6}	
		}
		System.out.printf("%d\t",sum);
	}
		}
	}
