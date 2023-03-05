package com.springcore.autowiring.xml;

public class College 
{
	private Student stdnt;

	public Student getStdnt() {
		return stdnt;
	}

	public void setStdnt(Student stdnt) {
		this.stdnt = stdnt;
	}

	public College() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student Details :  \n" + stdnt;
	}
	

}
