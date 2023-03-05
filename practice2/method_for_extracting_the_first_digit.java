package com.practice2;

import java.util.Scanner;

public class method_for_extracting_the_first_digit 
{
	static void firstdigit(int x)
	{
		int n =0;
		int y =0;
		while(x>0)
		{
			n = x%10;
			x=x/10;
			if(x==0)
			{
				break;
			}
			y = x;
		}	
	System.out.println("First Digit Is "+y);	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		sc.close();
		firstdigit(x);
	}
}
