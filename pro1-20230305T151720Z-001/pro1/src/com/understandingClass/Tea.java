package com.understandingClass;

public class Tea 
{
	//A software object's state is stored in fields like sugar, tealeaf,water,milk
	
String sugar;  //Instance variables − Instance variables are variables within a class but outside any method.
int tealeaf;  //These variables are initialized when the class is instantiated
char water;
static float Milk; // Class variables are variables declared within a class, outside any method, with the static keyword.

//A software object's behaviour is shown via Methods like refreshment()
void refreshment(int level) //method 1
{
	tealeaf = level; //Variables defined inside methods, constructors or blocks are called local variables.
}
int  releasestress() //method 2
{
	System.out.println("Refereshment level is : " + tealeaf);
	return tealeaf;
}

Tea(String type) //This is a Constructor having one parameter, type. 
{
System.out.println("Served Tea is : " + type);
}
public static void main(String[] args)
{
	Tea myTea = new Tea("masala tea"); // Creating an object myTea. objects is created using new keyword
    myTea.refreshment(10);             // Calling a class method via using OBJECT
    myTea.releasestress();           // Calling a class method via using OBJECT
}

}
