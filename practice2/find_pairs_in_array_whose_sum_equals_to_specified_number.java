package com.practice2;

public class find_pairs_in_array_whose_sum_equals_to_specified_number 
{

	//Java program to find all pairs of elements in an array whose sum is equal to a specified number
		public static void main(String[] args) 
		{
			int[] x = {11,52,9,10,19,74,10,5,96};
			int y =20;
			int z=0;
			for(int i =0;i<x.length;i++)
			{
				for(int  j = i+1;j<x.length;j++)
				{
					if((x[i]+x[j])== y)
				 {
					z = y;
					System.out.println("\nPair is "+ x[i]+ " and "+ x[j]+" at index "+ i +" and "+ j);
					break;
				 }
					
				}
			}
			if(z == y)
			{
				System.out.println("\nGot The Pair");
			}
			else
			{
				System.out.println("No Such Pair Present");
			}
		}
	}
