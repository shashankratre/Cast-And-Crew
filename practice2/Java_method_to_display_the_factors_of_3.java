package com.practice2;

import java.util.Scanner;

public class Java_method_to_display_the_factors_of_3 
{
	void factor(int x)
	{
		int n =x;
		while(n%3==0)
		{
			System.out.print("3*");
			 n = n/3;
		}
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number ");
int x = sc.nextInt();
Java_method_to_display_the_factors_of_3  fac = new Java_method_to_display_the_factors_of_3 ();
fac.factor(x);
sc.close();

	}

}
