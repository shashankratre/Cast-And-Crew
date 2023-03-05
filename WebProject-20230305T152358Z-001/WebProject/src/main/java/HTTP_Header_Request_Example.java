import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTTP_Header_Request_Example
 */
@WebServlet("/HTTP_Header_Request_Example")
public class HTTP_Header_Request_Example extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String title = "HTTP HEADER REQUEST EXAMPLE";
		pw.println("<html>"+
		"<head><title>"+title+"</title></head>"+
				
		"<style>"+
				"table, th{ border : 2px solid red;} "+
		"</style>"+
				
		"<body>"+
		"<h1>"+title+"<h1>"+
		"<table style =width :100%>"+
		"<tr>"+
		"<th> Header Names </th>"+
		"<th> Header Values </th>"+
		"</tr>"
	);
		Enumeration headernames = request.getHeaderNames();
		while(headernames.hasMoreElements())
		{
			String headername = (String)headernames.nextElement();
			pw.println("<tr><td>"+ headername+ "</td>\n");
			String headervalues = request.getHeader(headername);
			pw.println("<td>"+ headervalues+ "</td><tr>\n");
		}
		pw.println("</table>\n</body>\n</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
