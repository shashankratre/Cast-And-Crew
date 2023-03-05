package com.practice2;

import java.util.Scanner;

public class program_to_concatenate_a_given_string 
{
	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string - ");
String s1= sc.nextLine();
System.out.println("Enter another string - ");
String s2= sc.nextLine();

String s3 = s1+" " +s2;
System.out.println("Concated String : " + s3);

sc.close();
	}
}
