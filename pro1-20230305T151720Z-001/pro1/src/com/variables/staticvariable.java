package com.variables;

public class staticvariable 
{
static String empname = "Employee Name : ";
static String dep = "Department of the employee : ";
static String sal = "Monthly Salary of Employee : ";
static int basesal =10000 ;
	public static void main(String[] args) 
	{
		String a =" Mohan";
		String b =" Sohan";
		String c =" David";
		int d = basesal + 80000*2;
		int e = basesal+90000;
		int i = basesal+50000/2;
		String f = "CSE";
		String g = "Electrical";
		String h = "Mechanical";
		
		System.out.println(empname + a );
		System.out.println(dep + f );
		System.out.println( sal + d );
		
		System.out.println(" ");
		
		System.out.println(empname + b );
		System.out.println(dep + g );
		System.out.println( sal + e );
		
		System.out.println(" ");
		
		System.out.println(empname + c );
		System.out.println(dep + h );
		System.out.println(sal +  i );

	}

}
