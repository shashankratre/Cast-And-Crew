package com.practice;

public class quadraticroots 
{

	public static void main(String[] args) 
	{
         int a = 1;
         int b = 4;
         int c = 4;
         double root1, root2;
         double determinant = b*b - 4*a*c;
         root1 = (-b + Math.sqrt(determinant)) / (2*a);
         root2 = (-b - Math.sqrt(determinant)) / (2*a);
         
         System.out.println("Roots of the equation is " +root1 +" and "+root2);
         
	}

}
