package com.practice2;

import java.util.Scanner;

public class program_to_print_right_angle_triangle_pattern_repeated_number 
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows - ");
int x = sc.nextInt();
for(int i =1;i<=x;i++)
{
	for(int j =1;j<=i;j++)
	{
		System.out.print(i);	
	}
	System.out.println("");
}
sc.close();
	}

}
