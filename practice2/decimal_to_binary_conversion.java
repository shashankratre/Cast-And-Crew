package com.practice2;

import java.util.Scanner;

public class decimal_to_binary_conversion {

	// Decimal To BINARY CONVERSION
		public static void main(String[] args) 
		{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A Number ");
	int x = sc.nextInt();
	String y =" ";
	int n =0;
	while(x>0)
	{
		n = x % 2;
		y = n + "" + y; // IMP Logic
		x = x / 2;	
	}
	System.out.println(y);

	sc.close();
		}
	}
