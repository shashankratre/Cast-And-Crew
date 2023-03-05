package com.practice2;

public class number_greater_than_average_in_array {
	//Java program to find the numbers greater than the average of the elements of a given array.
		public static void main(String[] args) 
		{
	      int[] x = {10,20,30,40,24,78,9};
	      int sum =0;
	      double avg = 0;
	      int max =0;
	      for(int i =0;i<x.length;i++)
	      {
	    	  sum = sum + x[i]; 
	      }
	      System.out.println("\n Sum of Array Elements = "+sum);
	      avg = sum / (x.length);
	      System.out.println("\n Average of Array Elements = "+ avg);

	     for(int i =0;i<x.length;i++)
	     {
	    	 if(x[i]>avg)
	    	 {
	    		 max = x[i];
	    		  System.out.println("\n Numbers Greater Than The Average of The Elements of the given array = "+max);
	    	 } 
	     }   
		}
	}