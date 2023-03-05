package com.springcore.referenceinjection;

public class University 
{
private String uniname;
private String collegename;
private int registration;
private StudentDetails sd;

public String getUniname() {
	return uniname;
}
public String getCollegename() {
	return collegename;
}
public int getRegistration() {
	return registration;
}
public StudentDetails getSd() {
	return sd;
}
public void setUniname(String uniname) {
	this.uniname = uniname;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
public void setRegistration(int registration) {
	this.registration = registration;
}
public void setSd(StudentDetails sd) {
	this.sd = sd;
}
public University() {
	super();
	
}
@Override
public String toString() {
	return "University Name :  " + uniname + ",\nCollege Name :  " + collegename + ",\nCollege Registration :  " + registration +"\n"
			+ "\nStudent Details :  \n" + sd;
}
}
