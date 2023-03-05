package com.practice2;

import java.util.Scanner;

public class program_to_read_a_string_and_return_true_if_it_ends_with_a_specified_string_of_length
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String s = sc.nextLine();
		System.out.println("Enter a String pattern - ");
		String s1 = sc.nextLine();
		if(s.length()<2)
		{
			System.out.println("Can not changed " + s);
		}
		else
		{
			System.out.println( "String Contains "+s1+ " !!"+s1.equalsIgnoreCase(s.substring(s.length()-2, s.length())));
		}
		sc.close();
	}
}
