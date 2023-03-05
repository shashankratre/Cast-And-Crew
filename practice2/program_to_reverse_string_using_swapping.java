package com.practice2;

import java.util.Scanner;

public class program_to_reverse_string_using_swapping 
{
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String - ");
String s = sc.nextLine();
String s2="";
String[] s1 = s.split("\\s+");
for(int i =0;i<s1.length;i++)
{
  s2 =s2+" "+s1[i];
 
}
char c[] = s2.toCharArray();
int n = s2.length();
int start =0;
int end = n-1;
while(start <=end)
{
	char tempo = c[start];
	c[start]=c[end];
	c[end]=tempo;
	start++;
	end--;
}
String reversedstring = String.valueOf(c);
System.out.print("REVERSED STRING : "+reversedstring.toString());  
sc.close();
}
}