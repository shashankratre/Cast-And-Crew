import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadAll_FormParameter
 */
@WebServlet("/ReadAll_FormParameter")
public class ReadAll_FormParameter extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String title = "READ ALL FORM PARAMETERS";
		String docType = "<!doctype>";
		pw.println(docType+
				"<html>"+
				 "<head><title>" + title + "</title></head>" +
				"<style>"
				+ "table, th {"
				+ "  border:1px solid black;"
				+ "}"
				+ "</style>"+
				"<body>"+
				"<h1>"+title+"<h1>"+
				"<table style=width:100%>"+
				"<tr>"+
				"<th> PARAMETER NAMES </th>"+
                "<th> PARAMETER VALUES </th>"+
                "</tr>"	
				);
		Enumeration paramnames = request.getParameterNames();
		
		while(paramnames.hasMoreElements())
		{
			String paraname = (String)paramnames.nextElement();
			pw.print("<tr><td>" + paraname + "</td>\n<td>");
			
			String[] paravalues = request.getParameterValues(paraname);
			pw.println("<ul>");
			for(int i =0;i<paravalues.length;i++)
			{
				pw.println("<li>" + paravalues[i]);
			}
			pw.println("</ul>");
		}
		pw.println("</tr>\n</table>\n</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		doGet(request, response);
	}

}
