package com.springcore.autowiring.annotations.qualifier;

public class Customer 
{
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Customer Name :  " + name;
}
}
