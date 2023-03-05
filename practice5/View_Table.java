package com.practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class View_Table extends Database_Credentials
{

	public static void main(String[] args) throws Exception
	{
		Connection c = DriverManager.getConnection(serverurl, id, pass);
		System.out.println("CONNECTION ESTABLISHED");
		Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("Select * From STUDENT_REGISTRATION");
        System.out.println("DATA PRESENT IN TABLE"); 
        while(rs.next()) 
        {
        System.out.println("ID:"+rs.getInt(1)+" First Name : " + rs.getString(2)+" Last Name : " +
        rs.getString(3)+" Age :  "+rs.getInt(4)); 
        }
        c.close();
        s.close();
        rs.close();
	
	}
}
