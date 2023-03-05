

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirect_Servlet_Page
 */
@WebServlet("/Redirect_Servlet_Page")
public class Redirect_Servlet_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
	String site = new String( "https://www.google.com");
	response.sendRedirect(site);
	/*
	 * we can also use this methods combine to redirect page
	 * response.setStatus(response.SC_MOVED_PERMANENTLY);
	 * response.setHeader("Location", site);
	 */
		
	}
}
