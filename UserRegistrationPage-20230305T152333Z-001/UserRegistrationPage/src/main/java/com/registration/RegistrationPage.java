package com.registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationPage
 */
@WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		if(fname.isEmpty() || lname.isEmpty()||uname.isEmpty()||pass.isEmpty()||contact.isEmpty()||address.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
			rd.forward(request, response);
		}
	}

}
