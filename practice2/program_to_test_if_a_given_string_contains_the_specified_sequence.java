package com.practice2;

import java.util.Scanner;

public class program_to_test_if_a_given_string_contains_the_specified_sequence 
{
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String - ");
String s1 = sc.nextLine();
System.out.println("Enter the sequence - ");
String s2 = sc.nextLine();
int count =1;
if (!(" ".equals(s1.substring(0, 1))) && !(" ".equals(s1.substring(s1.length() - 1))))//we can remove this otherwise when any space come before and after the string it will not give any output 
	{
	String[] s3 = s1.split("\\s+"); // need to initialize string array so that each words from the input string can be stored through split() method
	
for (int i = 0; i < s3.length; i++) // now iterate to new array length s3, so that we can store all words in s3[] array
{
	System.out.printf(s3[i].toString()+" "); // storing and converting it to string elements and print it as a string
	
	if(s3[i].toString().equalsIgnoreCase(s2)) //here we need to convert the string array s3 to string elements so that we can compare with the given sequence word
	{
		 count =0; //using this so that our output doesn't get printed every time in for loop
	}
}
if(count ==0)
{
	System.out.println("\nSequence found : "+true);
}
else
{
	System.out.println("\nSequence not found : "+false);	
}
}
sc.close();
	}
}
