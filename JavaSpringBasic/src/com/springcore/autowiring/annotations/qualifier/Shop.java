package com.springcore.autowiring.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Shop
{
	@Autowired
	@Qualifier("customerdetails2")
	private Customer customer;
private String shopname;
public String getShopname() {
	return shopname;
}
public Customer getCustomer() {
	return customer;
}
public void setShopname(String shopname) {
	this.shopname = shopname;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Shop Name :  " + shopname + ",\nCustomer :  " + customer;
}

}
