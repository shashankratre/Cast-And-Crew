package com.practice2;

import java.util.Scanner;

public class program_to_check_a_string_ends_with_specific_word
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string - ");
String s = sc.nextLine();
System.out.println("Enter the word - ");
String s1 = sc.nextLine();
boolean end = s.endsWith(s1);
System.out.println(end);
sc.close();
	}

}
