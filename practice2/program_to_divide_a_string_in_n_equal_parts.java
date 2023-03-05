package com.practice2;

import java.util.Scanner;

public class program_to_divide_a_string_in_n_equal_parts 
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a STRING : ");
String s = sc.nextLine();
System.out.println("Enter a number to divide : ");
int x = sc.nextInt();
if(s.length()%x!=0)
{
	System.out.println("Size of string can't be divided by "+x);	
}
else
{
for(int i =0;i<s.length();i++)
{
		    if(i%(s.length()/x)==0)
			System.out.println();
			System.out.print(s.charAt(i));	
}
}
sc.close();
	}
}
