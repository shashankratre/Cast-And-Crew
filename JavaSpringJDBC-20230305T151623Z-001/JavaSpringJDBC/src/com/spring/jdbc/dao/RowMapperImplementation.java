package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.tableclass.ClubEmployee;

public class RowMapperImplementation implements RowMapper<ClubEmployee>
{

	@Override
	public ClubEmployee mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		ClubEmployee CE = new ClubEmployee();
		CE.setEMPID(rs.getInt(1));
		CE.setFIRST_NAME(rs.getString(2));
		CE.setLAST_NAME(rs.getString("LAST_NAME"));
		CE.setAGE(rs.getInt("AGE"));
		return CE;
	}

}
