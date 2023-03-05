package com.practice;

import java.util.Arrays;

public class concate_two_arrays {
	//CONCATE TWO ARRAYS
		public static void main(String[] args)
		
			{
				int[] x = {1,2,3};
				int[] y = {4,5,6};
				int[] z = new int[x.length+y.length];
				int indx =0;
				for (int i =0;i<x.length;i++)
				{
					z[indx] = x[i];	
					indx++;
				}
				for (int i =0;i<y.length;i++)
				{
					z[indx] = y[i];	
					indx++;
				}
				System.out.println(Arrays.toString(z));
			}
				}