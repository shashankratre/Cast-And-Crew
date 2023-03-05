package com.practice;

import java.util.Scanner;

public class print_star_pattern 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter a number  = ");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
      for (int i =0;i<x;i++) 
	{
		 for(int j =0;j<=i;j++) 
        {
        	System.out.print("*");
        }
			System.out.println();
	}
       
	sc.close();
}
}