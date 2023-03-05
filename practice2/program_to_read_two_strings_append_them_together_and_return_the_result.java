package com.practice2;

import java.util.Scanner;

public class program_to_read_two_strings_append_them_together_and_return_the_result {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String - ");
		String s = sc.nextLine();
		System.out.println("Enter another String - ");
		String s1 = sc.nextLine();
		int n = s.length();
		int n1= s1.length();
		if(n==n1)
		{
			System.out.println(s+" "+s1);
		}
		else if (n>n1)
		{
			int diff = n - n1;
			System.out.print(s.substring(diff, n) + s1);
		}
		else
		{
			int dif = n1-n;
			System.out.println(s1.substring(dif, n1) + s);
		}
			
		
	}
}
