package com.practice;

import java.util.Scanner;
// Niven Number
public class nivennumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x;
		int z =0;
		while(x>0)
		{
			int n = x%10;
			x=x/10;
			 z = x + n;
			 break;
		}
		if (y%z == 0)
		{
			System.out.println("Niven Number");
		}
		else
		{
			System.out.println("Not Niven Number");
		}
sc.close();
	}

}
