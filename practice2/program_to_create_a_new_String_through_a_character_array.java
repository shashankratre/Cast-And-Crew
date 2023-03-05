package com.practice2;

import java.util.Scanner;

public class program_to_create_a_new_String_through_a_character_array 
{

	public static void main(String[] args) 
	{
		int a;
		int i;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter no of elements you want - ");
		a=sc.nextInt();
		System.out.println("Enter Character Elements : ");
		char[] ch  = new char[10] ;
		for(i =0;i<a;i++)
		{
		 ch[i] = sc.next().charAt(0);
		}	
		for(i=0;i<a;i++)
		{
			System.out.println(ch[i]);
		}
		String s = String.copyValueOf(ch, 0, a);
		System.out.println("String word "+s);
sc.close();
	}

}
