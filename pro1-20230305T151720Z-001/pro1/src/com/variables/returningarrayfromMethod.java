package com.variables;

public class returningarrayfromMethod 
{
int[] display() //if we don't declared int as int[] it will give error of type mismatch
{
	int[] num = {15,2,30,4,55};
	return num; //returning the reference of the array that refers to the array elements
}

	public static void main(String[] args) 
	{
		returningarrayfromMethod returnedarray = new returningarrayfromMethod();
		int[] num = returnedarray.display();
		for(int i =0;i<num.length;i++)
		System.out.println(num[i]);
	}

}
/*
to return array from a method frist we need to initialize array elements and return it
then create object in main method
then call the object via array element
##
The syntax of calling a method is as follows:

data-type[ ] arrayname = obj-ref.method-name(arguments);
##
and use the local variable element via "for" loop
*/