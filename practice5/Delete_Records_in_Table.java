package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete_Records_in_Table extends  Database_Credentials
{

	public static void main(String[] args) throws Exception
	{
		Connection c = DriverManager.getConnection(serverurl, id, pass);
		Statement s = c.createStatement();
		String sqlquery = "DELETE FROM STUDENT_REGISTRATION WHERE ID =1013";
		s.executeUpdate(sqlquery);
		ResultSet rs = s.executeQuery("SELECT * From STUDENT_REGISTRATION");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
		}
		c.close();
		rs.close();

	}

}
