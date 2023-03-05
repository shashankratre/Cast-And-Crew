package com.practice4;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Comparator_In_TreeMap 
{

	public static void main(String[] args) 
	{
	
		 TreeMap<Integer, String> hm = new TreeMap<Integer, String>(new SortingDetails());//Comparator is working when we try to sort based on "key"
			
			hm.put(1875, "Rohit");
			hm.put(1897, "Aman");
			hm.put(1839, "Rahul");
			hm.put(1804, "Surya");
			hm.put(1823, "Pant");
			hm.put(1815, "Rohit R");
			hm.put(1878, "Aman D");
			hm.put(1816, "Rahul B");
			hm.put(1832, "Surya K");
			hm.put(1823, "Pant K");
						
			for(Map.Entry<Integer,String> entry : hm.entrySet())
	       {
			System.out.println(entry.getKey());
	         }
	}
}
class SortingDetails implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		return o1.compareTo(o2);
	}
}
