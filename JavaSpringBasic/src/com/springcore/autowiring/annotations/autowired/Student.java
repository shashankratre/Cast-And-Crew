package com.springcore.autowiring.annotations.autowired;

import java.util.List;
import java.util.Map;

public class Student 
{
	private List<String> name;
	private Map<Integer,String> subject;
	
	public List<String> getName() {
		return name;
	}
	public Map<Integer, String> getSubject() {
		return subject;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public void setSubject(Map<Integer, String> subject) {
		this.subject = subject;
	}
	public Student() 
	{
		super();
		
	}
	public Student(List<String> name, Map<Integer, String> subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student Name :  " + name + ",\nSubject :  " + subject;
	}
	

}
