package com.practice2;

import java.util.Scanner;

public class program_to_get_the_Unicode_code_point 
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
String s = sc.nextLine();
System.out.println("Enter Index : ");
int x = sc.nextInt();
int y = s.codePointAt(x);
System.out.println("Code point at index "+x+" is "+y);

sc.close();

	}

}
