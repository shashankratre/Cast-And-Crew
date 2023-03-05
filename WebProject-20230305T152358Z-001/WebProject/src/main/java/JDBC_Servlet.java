

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBC_Servlet
 */
@WebServlet("/JDBC_Servlet")
public class JDBC_Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//final String driver = "net.sourceforge.jtds.jdbc.Driver";
		final String url = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\"";
		final String id = "capspaytraining";
		final String pass = "CastandCrew@98";
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String title = "DATABASE ITEMS";
		String doctype ="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		pw.println(doctype +""
				+ "<html>"
				+ "<head>"
				+ "<title>"+
				    title
				+ "</title>"
				+ "</head>"
				+ "<body bgcolor = \"#f0f0f0\">\""
				+ "<h1 align = \"center\">" + title + "</h1>"
				);
		try
		{
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, id, pass);
		
		Statement st = con.createStatement();
		String sqlquery = "SELECT Employee_Id, Employee_Name,Salary From Employee";
		//String sqlquery = "Select ID, FIRST_NAME,AGE From STUDENT_REGISTRATION";
		ResultSet rs = st.executeQuery(sqlquery);
		while(rs.next())
		{
			int Id = rs.getInt(1);
			String name = rs.getString("Employee_Name");
			float salary = rs.getFloat("Salary");
			
			pw.println("ID :" + Id + "<br>");
			pw.println("Name : "+name + "<br>");
			pw.println("Salary : "+salary + "<br>");
		}
		pw.println("</body></html>");
		con.close();
		st.close();
		rs.close();
		}
		catch(SQLException | ClassNotFoundException  se)
		{
			se.printStackTrace();
		} 
	}

}
