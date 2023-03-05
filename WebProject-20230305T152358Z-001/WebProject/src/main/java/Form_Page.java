

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form_Page
 */
@WebServlet("/Form_Page")
public class Form_Page extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String title = " FIRST FORM PAGE IN SERVLET";
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
