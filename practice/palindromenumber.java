package com.practice;

import java.util.Scanner;
// Check whether a 3 digit number is palindrome or not
public class palindromenumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check  = ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z = x;
		int n =0;
		sc.close();
		
		// for(int i =0;i<x;i++) // we can use i<x for dynamic input digits but it will not work with digit starting with 1
			 for(int i =0;i<3;i++) 
	        {
	        	int y = x%10;
	        	n =n*10+y;
	        	x=x/10;
	        	System.out.println(n);
	        }
		 if(n == z)
		 {
			 System.out.println("palindrome");
			 
		 }
		 else 
		 {
			 System.out.println("not a palindrome");
		 }
	}

}
