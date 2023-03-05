package com.practice2;

import java.util.Scanner;

public class program_to_print_after_removing_duplicates_from_a_given_string
{

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string : ");
String s = sc.nextLine();
String s1 ="";
String s2 ="";
char[] ch = s.toCharArray();
for(char c : ch)
{
	
	if(s1.indexOf(c)==-1)
	{
		s1=s1+c;
		s2=s1;
	}
}
if(s2.equalsIgnoreCase(s1))
{
	System.out.println(s1);
}
else
{
	System.out.println(s1);
}
sc.close();
	}

}
