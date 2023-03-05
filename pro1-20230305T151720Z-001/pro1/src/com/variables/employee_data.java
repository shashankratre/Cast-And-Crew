package com.variables;

public class employee_data 
{

	static String empname = "Employee Name : ";
	static String dep = "Department of the employee : ";
	static String sal = "Monthly Salary of Employee : ";
	static int basic =10000 ;
	public static void main(String[] args) 
	{
		String[] name = {"Rakesh", "Mohan", "Rahul","David","Martin"};
		String[] department= {"CSE","ELECTRICAL","ELECTRONICS","MECHANICAL","INFORMATION TECH"};
		int[] salary = {120000,70000,90000,150000,80000};
		int total=0;    //to get sum/total of any number in array we first define the local variable of the array to 0
		int max=salary[0];  //to get max of any number in array we first define the local variable of the array to 0
		
		for (int i=0;i<name.length;i++)
		{
			int netsal = basic + salary[i];
			System.out.println("\n"+empname + name[i]);
			System.out.println(sal + netsal);
			System.out.println(dep + department[i]);
		}
		
		for (int i=0;i<salary.length;i++)
		{
			 total += salary[i];
			
		}
		System.out.println("\nTOTAL SALARY GIVEN : " + total);
		
		for (int i=0;i<salary.length;i++)
		{
			
			 if(salary[i]>max)
				 max = salary[i];
		}
		System.out.println("\nMAXIMUM SALARY GIVEN : " + max);
		System.out.println("\nAVERAGE SALARY GIVEN : " + total/5);
		
		//ENHANCED FOR LOOP OR FOREACH LOOP
		System.out.println("\nTOTAL DEPARTMENT NAME ");
		for(String element : department)
		{
			System.out.println("\t"+element);
		}
		
	}

}
