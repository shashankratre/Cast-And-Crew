package com.practice2;

import java.util.Scanner;

public class method_to_count_the_number_of_digits
{
	static int digit(int x, int y)
	{
		int count =0;
		int n =0;
		while(x>0)
		{
			n = x%10;
			if(n==y)
			{
				count++;
			}
			x=x/10;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a = sc.nextInt();
		System.out.println("Enter the digit you want to count = ");
		int b = sc.nextInt();
		System.out.println("\nNumber of Digit is : "+digit(a,b));
          sc.close();
	}
}
