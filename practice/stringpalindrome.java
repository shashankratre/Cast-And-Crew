package com.practice;

import java.util.Scanner;

public class stringpalindrome 
{
	static void checkPalindrome(String input)
	{
		int length = input.length();
		if(input.charAt(0)==input.charAt(length-1)) 
		{
			System.out.println(input + " is palindrome ");
		}
		else
		{
			System.out.println(input + " is not palindrome ");
		}
	}
		public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Statement: ");
		String str = sc.nextLine();
		checkPalindrome(str);
		sc.close();
		}
}
