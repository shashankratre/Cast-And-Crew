package com.practice2;

import java.util.Scanner;

public class method_to_check_middle_point_between_the_three_integers 
{
	static boolean midpoint(int x, int y,int z)
	{
		int max = Math.max(x, Math.max(y, z));
		int min = Math.min(x,Math.min(y, z));
		int mid = x+y+z-max-min;
		return ((mid - min)==(max-mid));
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		System.out.println("Enter Third Number :");
		int c = sc.nextInt();
	    System.out.println("midpoint :  ! "+midpoint(a,b,c));
        sc.close();
	}
}
