package com.practice;

import java.util.Scanner;
// Strong Number = when the sum of the factorial of all digits is equal the original number
public class strongnumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x;
		int n =0;
		int z =0;
		while(x>0)
		{
			n = x%10;
			int fact =1;
			for(int i =1;i<=n;i++)
			{
				fact = fact * i;
			}
			z = z + fact;
			x=x/10;
			System.out.println(z);
		}
		if(y==z)
		{
			System.out.println("STRONG NUMBER");
		}
		else
		{
			System.out.println("NOT A STRONG NUMBER");
		}
		sc.close();
	}
}
