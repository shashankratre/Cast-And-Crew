package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.tableclass.ClubEmployee;

public interface ClubEmployeeDao 
{
	public int insert(ClubEmployee clubemployee);
	public int update(ClubEmployee clubemployee);
	public int delete(ClubEmployee clubemployee);
	public ClubEmployee getEmployeeDetails(int id);
	public List<ClubEmployee> getAllEmployeeDetails();

}
