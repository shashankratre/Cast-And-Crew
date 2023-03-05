package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.isEmpty()||pass.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("loginpage.jsp");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("loggedinpage.jsp");
			rd.forward(request, response);
		}

	}

}
