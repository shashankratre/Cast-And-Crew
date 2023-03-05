package com.practice;
//import java.util.Arrays;
public class initialize_and_print_2D_array_elements {
	public static void main(String[] args) 
	{
int[][] x = {{60,70,85},{90,80,70},{85,95,65},{100,95,85}};

System.out.println("Student Marks Matrix");
// System.out.println(Arrays.deepToString(x));
System.out.println("\n Student 1 Marks ");
System.out.println("\t English " +x[0][0]);
System.out.println("\t Maths "+x[0][1]);
System.out.println("\t CSE "+x[0][2]);
System.out.println("\n Student 2 Marks ");
System.out.println("\t English " +x[1][0]);
System.out.println("\t Maths "+x[1][1]);
System.out.println("\t CSE " +x[1][2]);
System.out.println("\n Student 3 Marks ");
System.out.println("\t English " +x[2][0]);
System.out.println("\t Maths "+x[2][1]);
System.out.println("\t CSE " +x[2][2]);
System.out.println("\n Student 4 Marks ");
System.out.println("\t English " +x[3][0]);
System.out.println("\t Maths "+x[3][1]);
System.out.println("\t CSE " +x[3][2]);
	}

}
