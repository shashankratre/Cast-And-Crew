package com.practice2;

import java.util.Scanner;

public class method_to_sum_digits_of_number 
{
	 void digitsum(int x)
	{
		int z =0;
		while(x>0)
		{
			int n = x%10;
			 z = z+n;
			 x =x/10;	
		}
		 System.out.println("Sum of digits of given number is : "+z);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		method_to_sum_digits_of_number  d = new method_to_sum_digits_of_number ();
		d.digitsum(x);
	    sc.close();
	}
}
