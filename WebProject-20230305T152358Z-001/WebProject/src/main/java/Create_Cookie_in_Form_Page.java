

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Create_Cookie_in_Form_Page
 */
@WebServlet("/Create_Cookie_in_Form_Page")
public class Create_Cookie_in_Form_Page extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Cookie firstname = new Cookie("first_name",request.getParameter("first_name"));
		Cookie lastname = new Cookie("last_name",request.getParameter("last_name"));
		
		firstname.setMaxAge(60*60*24);
		lastname.setMaxAge(60*60*24);
		
		response.addCookie(firstname);
		response.addCookie(lastname);
		
        response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String title = " CREATE COOKIE IN FORM PAGE";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n"; 
		pw.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		               "<h1 align = \"center\">" + title + "</h1>\n" +
		               "<ul>\n" +
		               "  <li><b>First Name</b>: "
		                  + request.getParameter("first_name") + "\n" +
		                  "  <li><b>Last Name</b>: "
		                  + request.getParameter("last_name") + "\n" +
		               "</ul>\n" +
		            "</body>" +
		         "</html>"
		      );
	}

}
