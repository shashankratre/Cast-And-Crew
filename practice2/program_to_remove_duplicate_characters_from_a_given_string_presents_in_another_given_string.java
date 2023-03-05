package com.practice2;

import java.util.Scanner;

public class program_to_remove_duplicate_characters_from_a_given_string_presents_in_another_given_string {

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string : ");
String s = sc.nextLine();
System.out.println("Enter the word : ");
String s1 = sc.nextLine();
char[] c = new char[256];
for(int i =0;i<s1.length();i++)
{
	c[s1.charAt(i)]++;
}
System.out.println("New String is : ");
for(int i=0;i<s.length();i++)
{

	if(c[s.charAt(i)]==0)
	{
		System.out.print(s.charAt(i));
	}
}
sc.close();
	}
}
//the quick fox is in forest of india
//eoiqfc