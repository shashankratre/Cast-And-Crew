package com.variables;

public class instancevariable 
{
String name;  // instance variable
double salary; //instance variable

 void employee(String empname)
{
	name = empname;
}
 void setsalary(double empsalary)
 {
	 salary = empsalary;
 }
 void printdetails()
 {
	 System.out.println(name);
	 System.out.println(salary);
 
 }
	public static void main(String[] args) 
	{
		instancevariable EMPLOYEE = new instancevariable();
		EMPLOYEE.employee("SHASHANK");
		EMPLOYEE.setsalary(800000);
	//	System.out.println(name); when we use instance variable we cann't get print value through main method
		
		EMPLOYEE.printdetails(); // to print all details we call the print method which we earlier defined via an Object EMPLOYEE.

	}

}
