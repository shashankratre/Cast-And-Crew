package com.practice2;

import java.util.Scanner;

public class program_to_read_a_string_if_the_string_begins_with_another_string {


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String s = sc.nextLine();
		System.out.println("Enter Starting String - ");
		String s1 = sc.nextLine();
		if(s.startsWith(s1))
		{
			System.out.println("String Starts with " + s1);
		}
		else
		{
			System.out.println(" ");
		}
		sc.close();
	}
}
