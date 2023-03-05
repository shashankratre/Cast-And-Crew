package com.practice;

public class find_a_element_in_given_array
{
	//find a element in a given array
		public static void main(String[] args) 
	{
		int[] x = {1,20,35,9,63,74};
		int n =74;
		for(int i =0;i<x.length;i++)
		{
			if(n==x[i])
			{
				System.out.println("Number Found At Index "+ i);
				break;
			}
		}
	}	
	}