package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.tableclass.ClubEmployee;

public class ClubEmployee_DaoImplemented implements ClubEmployeeDao
{
     private JdbcTemplate templ;
     
   //INSERT query
	@Override
	public int insert(ClubEmployee clubemployee) 
	{
	     String sql = "INSERT INTO ClubEmployee(FIRST_NAME,LAST_NAME,AGE) VALUES(?,?,?)";
	     
	     int r = this.templ.update(sql,clubemployee.getFIRST_NAME(),clubemployee.getLAST_NAME(),clubemployee.getAGE());
		
	     return r;
	}
	
	//UPDATE query
	@Override
	public int update(ClubEmployee clubemployee) 
	{
        String sql = "UPDATE ClubEmployee SET FIRST_NAME =?,LAST_NAME=?,AGE=? WHERE EMPID = ?";
	     
	     int r = this.templ.update(sql,clubemployee.getFIRST_NAME(),clubemployee.getLAST_NAME(),clubemployee.getAGE(),clubemployee.getEMPID());
		
	     return r;
	}
	
	//DELETE query
	@Override
	public int delete(ClubEmployee clubemployee) 
	{
		 String sql = "DELETE FROM ClubEmployee WHERE FIRST_NAME =?";
	     
	     int r = this.templ.update(sql,clubemployee.getFIRST_NAME());
		
	     return r;
	}
	
	//ROW mapper - select single data from table
	@Override
	public ClubEmployee getEmployeeDetails(int id) 
	{
		String query = "SELECT * FROM ClubEmployee WHERE EMPID =?";
		RowMapper<ClubEmployee> rowmapper = new RowMapperImplementation();
		ClubEmployee cemp = this.templ.queryForObject(query, rowmapper,id);
	
		return cemp;
	}
	
	//ROW MAPPER - SELECT ALL DATA FROM TABLE
	@Override
	public List<ClubEmployee> getAllEmployeeDetails() 
	{
		String query = "SELECT * FROM ClubEmployee";
		List<ClubEmployee> listclubemployee = this.templ.query(query, new RowMapperImplementation());
		return listclubemployee;
	}
	public JdbcTemplate getTempl() 
	{
		return templ;
	}
	public void setTempl(JdbcTemplate templ) 
	{
		this.templ = templ;
	}

	

	

	
	

}
