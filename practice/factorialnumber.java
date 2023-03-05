package com.practice;

import java.util.Scanner;
// Factorial Of a Number
public class factorialnumber 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y =1;
		for (int i =1 ;i<=x;++i)	
		{
		y = y*i;
		}
		System.out.println(y);
		sc.close();
		}

}
