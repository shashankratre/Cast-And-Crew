package com.practice2;

import java.util.Scanner;

public class method_to_check_whether_every_digit_of_a_given_integer_is_even
{
	static boolean evendigit(int x)
	{
		int n =0;
		while(x>0)
		{
			n = x%10;
			if(n%2!=0)
			{
				return false;
			}
			x=x/10;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		sc.close();
		System.out.println("Every digit even or not : "+evendigit(x));
	}

}
