package com.practice4;
import java.sql.*;
public class Create_JDBC_Connection
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\"", "capspaytraining", "CastandCrew@98");
			Statement stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery("SELECT * FROM Employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(3));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
