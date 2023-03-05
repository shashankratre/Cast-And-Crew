package com.practice;

import java.util.Scanner;

public class armstrongnumber 
{
	// Check Armstrong Number of 3 Digit values
	public static int pow(int a)
	{
		return a*a*a;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check  = ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z = x;
		sc.close();
        int n =0;
        int sum =0;
        for(int i =0;i<3;i++)
        {
        	int y = x%10;
        	n = pow(y);
        	x=x/10;
        	sum = sum + n;
        //	System.out.println(sum);
        }
        if (sum == z)
        {
        	System.out.println("Armstrong Number ");
        }
        else
        {
        	System.out.println("Not A Armstrong Number ");
        }
	}
}
