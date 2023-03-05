package com.practice2;

import java.util.Scanner;

public class program_to_create_a_new_string_from_a_given_string_swapping_the_last_two_characters_of_the_given_string {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String s = sc.nextLine();
		if(s.length()<2)
		{
			System.out.println("Can not changed " + s);
		}
		else
		{
			System.out.println( "New String " +s.substring(0, s.length()-2)+ s.charAt(s.length()-1) + s.charAt(s.length()-2));
		}
		sc.next();
	}
}