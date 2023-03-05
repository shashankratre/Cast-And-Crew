package com.practice;

import java.util.Scanner;

public class sunnynumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n =0;
		while(x>0)
		{
			n = x+1;
			double y =  Math.sqrt(n);
			if((y - Math.floor(y)==0))
			{
				System.out.println("sunny number");
			}
			else
			{
				System.out.println("not sunny number");
			}
			System.out.println(y);
			break;	
		}
		sc.close();
	}
}
