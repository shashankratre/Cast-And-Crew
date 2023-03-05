package com.practice2;

import java.util.Scanner;

public class program_to_print_number_of_occurance_of_character {

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string : ");
String s = sc.nextLine();
System.out.println("Enter the character : ");
char c = sc.next().charAt(0);
int count =0;
for(int i =0;i<s.length();i++)
{
	if(s.charAt(i)== c)
	{
		count++;
	}
}
System.out.println("Number Of occurance of character = "+count);
sc.close();
	}
}
