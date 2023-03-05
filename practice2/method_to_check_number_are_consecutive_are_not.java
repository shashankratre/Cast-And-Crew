package com.practice2;

import java.util.Scanner;

public class method_to_check_number_are_consecutive_are_not 
{
static  void consecutive(int x, int y, int z)
{
	boolean f = false;
	boolean t = true;
	if((x+1)==y&&(y+1)==z)
	{
		t =true;
		System.out.println("Given Numbers Are Consecutive\n"+t);
	}
	else
	{
		f = false;
		System.out.println("Given Number Are Not Consecutive\n"+f);
	}
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
		consecutive(a,b,c);
        sc.close();
	}

}
