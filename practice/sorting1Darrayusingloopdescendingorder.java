package com.practice;

public class sorting1Darrayusingloopdescendingorder 
{

	public static void main(String[] args) 
	{
	int[] x = {47,89,56,74,23,12,45,85,36,63,96,69};
	System.out.println("Sorted Descending Order Array is : ");
	for(int i =0;i<x.length;i++)
	{
		for(int j =i+1;j<x.length;j++)
		{
			int n =0;
			if(x[i]<x[j])
			{
				n = x[i];
				x[i]=x[j];
				x[j]=n;
			}
		}
		System.out.println(x[i]);
	}
	}
}