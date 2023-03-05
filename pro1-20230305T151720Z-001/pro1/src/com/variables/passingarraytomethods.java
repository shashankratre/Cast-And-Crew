package com.variables;

public class passingarraytomethods 
{
void dispaly(int x[])//passing array to methods
{
	for(int i =0;i<x.length;i++)
	{
	System.out.println(x[i]);
    }
}
	public static void main(String[] args) 
	{
		int[] x = {1,56,85,96,36,57,78,36};
		passingarraytomethods array = new passingarraytomethods();
		array.dispaly(x); //passing the array elements via reference
	}
}

/*
package arraysProgram;
public class PassingArrays {
public static void main(String[] args) 
{
  int x = 2; // Original value.
  int[ ] num = {0, 1}; // Original array.
   m1(x, num);
   System.out.println("Value of x: " +x);
   System.out.println("Value of num[1]: " +num[1]);
 }
public static void m1(int x, int[ ] num) 
{
   x = 5; // Modifying value of x.
   num[1] = 20; // Modifying array. 
 }
}

Output:
Value of x: 2
Value of num[1]: 20


*/

/*
As you can observe in the output, the value of x is the same but the values of the array are changed when modified inside the method.

Thus, if we change the array in the method, we will also see the change outside the method
*/