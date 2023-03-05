package com.practice;

import java.util.Scanner;

public class sum_and_sorting_of_user_input_array {
	public static void main(String[] args) 
	{
	
	//try 
	//{	
		int x;
	
		int sum =0;
		int sort =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		x = sc.nextInt();
		System.out.println("Enter Array elements ");
		int[] z = new int[10];
		//taking array elements
		for(int i=0;i<x;i++)
		{
			z[i] = sc.nextInt();
		}
		//sum of entered array
		for(int i =0;i<x;i++)
		{
			sum = sum +z[i];
		}
		System.out.println("Sum of entered array is " + sum);
		//SORTING OF entered array elements
		System.out.println("Sorting of entered array is : ");
		for(int i =0;i<x;i++)
		{
			for(int j =i+1;j<x;j++)
			{
				if(z[i]>z[j])
				{
				sort = z[i];
				z[i]=z[j];
				z[j]=sort;
				}
			}
			System.out.println(z[i]); //print the sorted array
         }
		//System.out.println(z[x+1]);
sc.close();
}
	/*
	catch(Exception e)
	{
		System.out.println("Thrown exception" + e);
	}
	System.out.println("Index Out Of Bound");
  }
  */
      
}


