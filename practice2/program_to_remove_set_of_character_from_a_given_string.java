package com.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class program_to_remove_set_of_character_from_a_given_string
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String s = sc.nextLine();
				
		int j =0;
		char[] c = s.toCharArray();
		for(int i =0;i<s.length();i++)
		{
			if(c[i]=='a' )
			{
				continue;
			}
			else if(i+1<s.length()&&c[i]=='b' && c[i+1]=='c')
			{
				++i;
			}
			else
			{
				c[j++]=c[i];
			}
		}
		char[] ch = Arrays.copyOfRange(c, 0, j);
				System.out.println(new String(ch));
				sc.close();
	}
}
