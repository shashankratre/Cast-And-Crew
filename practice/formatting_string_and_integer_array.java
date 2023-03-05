package com.practice;

public class formatting_string_and_integer_array {

	public static void main(String[] args) 
	{
int[] x = {25000,65000,85000,74000,96000};
String[] s = {"Sivam","Gautam","Raman","Saurav","Rohit"};

System.out.printf("%15s %15s \n", "Name", "Salary");

for(int i =0;i<x.length;i++) // size of array needs to be same in both array
{
System.out.printf("%15s %15s \n",s[i],x[i]);
}
	}
}
