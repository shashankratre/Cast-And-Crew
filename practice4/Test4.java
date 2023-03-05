package com.practice4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test4 
{

	public static void main(String[] args) 
	{
        HashMap<EmployeeDetails,Integer> hm = new HashMap<EmployeeDetails,Integer>();
		
    	hm.put( new EmployeeDetails("Sivam",1063,45652,24),1);
		hm.put(new EmployeeDetails("Zainab",1035,62963,26), 2 );
		hm.put (new EmployeeDetails("Abhishek",1083,55693,30), 3);
		hm.put(new EmployeeDetails("Pivam",1005,62458,27),4 );
		
		System.out.printf("%15s %20s %10s %15s \n","Name","EmployeeId","Salary","Age");
	    
		for(Entry<EmployeeDetails,Integer> entry : hm.entrySet())
		{
		System.out.println(entry.getKey());
		}
	}
}
class SortingDetail implements Comparator<EmployeeDetails>
{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		//return o1.getValue().name.compareToIgnoreCase(o2.getValue().name); // sorting based on name
				return (o1.age >o2.age)?1:-1; // sorting based on age
	}	
}
