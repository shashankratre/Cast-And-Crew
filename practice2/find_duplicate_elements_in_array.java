package com.practice2;

public class find_duplicate_elements_in_array 
{
	//Duplicate elements present in an array
		public static void main(String[] args) 
		{
			int[] x = {1,52,906,97,10,111,85,96,1};
			int i ;
			int count =0;
			for(i =0;i<x.length;i++)
			{
				for(int  j = i+1;j<x.length;j++)
				{
				if(x[i]==x[j])
				 {
					count =1;
					System.out.println("Duplicate element found at index "+i+" and "+j+" and duplicate element is "+x[i]);
				 }
				}
			}
			if(count == 1)
			{
				System.out.println("\nDuplicate element found in given array ");
			}
			else
			{
				System.out.println("No Duplicate element");
			}
		}

	}
