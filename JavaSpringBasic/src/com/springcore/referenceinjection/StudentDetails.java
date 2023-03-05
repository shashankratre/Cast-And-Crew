package com.springcore.referenceinjection;

public class StudentDetails 
{
	private String stuname;
    private	String branch;
    private	int rollno;
	public String getStuname() {
		return stuname;
	}
	public String getBranch() {
		return branch;
	}
	public int getRollno() {
		return rollno;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nStudent Name :  " + stuname + ",\nBranch :  " + branch + ",\nRoll No. :  " + rollno;
	}
	

}
