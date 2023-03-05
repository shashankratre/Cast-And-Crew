

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Simple_Servlet_Page
 */
@WebServlet("/Simple_Servlet_Page")
public class Simple_Servlet_Page extends HttpServlet 
{
	private int x ,y,z;
	Scanner sc = new Scanner(System.in);
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException 
	{
		x= 50;
		y=90;
		z= x+y;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");
	 PrintWriter output = response.getWriter();
	 
	output.println("<h1>Enter First Number : "+x+" </h1>");
	output.println("<h1>Enter Second Number :"+y+" </h1>");
	output.println("<h1> Sum of number : "+z+"</h1>");
	}
	public void destroy()
	{
		
	}
}
