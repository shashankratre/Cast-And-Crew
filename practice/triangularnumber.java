package com.practice;

import java.util.Scanner;

public class triangularnumber 
{

	public static void main(String[] args) 
	{
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int n =0;
int y =0;
for(int i =1;i<x;i++)
{
	n = n+i;
	if(n==x)
	{
		y = n;
		break;
	}
}
if(y==n)
{
	System.out.println("Triangular Number");
}
else
{
System.out.println("Not a Triangular Number");

}
sc.close();
	}
}
