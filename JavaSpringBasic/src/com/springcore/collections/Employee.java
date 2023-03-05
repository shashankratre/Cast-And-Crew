package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee 
{
	private String name;
	private List<String> city;
	private Set<Long> mobilenumber;
	private Map<String, Integer> experiance;
	public String getName() {
		return name;
	}
	public List<String> getCity() {
		return city;
	}
	public Set<Long> getMobilenumber() {
		return mobilenumber;
	}
	public Map<String, Integer> getExperiance() {
		return experiance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public void setMobilenumber(Set<Long> mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public void setExperiance(Map<String, Integer> experiance) {
		this.experiance = experiance;
	}
	public Employee(String name, List<String> city, Set<Long> mobilenumber, Map<String, Integer> experiance) {
		super();
		this.name = name;
		this.city = city;
		this.mobilenumber = mobilenumber;
		this.experiance = experiance;
	}
	public Employee() 
	{
		super();
		
	}
	@Override
	public String toString() {
		return "Name :  " + name + ",\nCity :  " + city + ",\nMobile Number :  " + mobilenumber + ",\nYear Of Experiance :  "
				+ experiance;
	}
	
	

}
