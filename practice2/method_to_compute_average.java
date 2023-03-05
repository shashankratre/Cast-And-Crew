package com.practice2;

import java.util.Scanner;

public class method_to_compute_average 
{
	static double average(double x,double y,double z)
	{
		double sum = x+y+z;
		System.out.println("\nSum of three number is "+sum);
		double avrg =sum/3;
		return avrg;
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		
		System.out.println("\nAverage of three number is : "+average(a,b,c));
          sc.close();
	}

}
