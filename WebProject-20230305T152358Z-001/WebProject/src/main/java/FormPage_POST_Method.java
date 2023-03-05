

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormPage_POST_Method")
public class FormPage_POST_Method extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String title = " FIRST FORM PAGE IN SERVLET USING POST METHOD";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n"; 
		pw.println(docType +
				 "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		               "<h1 align = \"right\">" + title + "</h1>\n" +
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		doGet(request, response);
	}

}
