package com.practice;

public class multiplication_of_array_elements 
{
	// MULTIPLICATION OF ARRAY ELEMENTS
		public static void main(String[] args) 
		{
			int[] s = {4,20,25};
			int mul = 1;
			for(int i =0;i<s.length;i++)
			{
				mul = s[i]*mul;
			}
	System.out.println("Multiplication of array elements is : " +mul);
		}
	}
