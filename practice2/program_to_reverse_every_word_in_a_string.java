package com.practice2;

import java.util.Scanner;

public class program_to_reverse_every_word_in_a_string {
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String - ");
String s = sc.nextLine();
String revstring ="";
String[] s1 = s.split("\\s+");
for(int i =0;i<s1.length;i++)
{
   String s2 = s1[i];
   String revword ="";
   for(int j = s2.length()-1;j>=0;j--)
   {
	   revword = revword + s2.charAt(j);
   }
   revstring = revstring + revword + " ";
}
System.out.println(revstring);
sc.close();
}

}
