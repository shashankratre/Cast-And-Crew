package com.practice;
//simple array printing
public class print1Darray 
{

	public static void main(String[] args)
	{
		int[] x= {56,87,96,78,36,45,61,23};
		for(int i=0;i<x.length;i++) //while using .length not to use <= otherwise it will throw an error always use < only  
		{
			System.out.println(x[i]);
		}
	}
	}
