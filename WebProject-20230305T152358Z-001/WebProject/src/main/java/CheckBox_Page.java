import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBox_Page
 */
@WebServlet("/CheckBox_Page")
public class CheckBox_Page extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	String title ="CREATING A CHECK BOX PAGE USING SERVLET";
	
	String docType ="<!doctype html public \\\\\\\"-//w3c//dtd html 4.0 \\\" + \\\"transitional//en\\\\\\\">";
	pw.println(docType+
			"<html>"+
			"<head><title>" +title+"</title></head>"+
			"<body>"+
			"<h1>"+title+"</h1>"+
			"<li><b>MATHS : </b>"
			+request.getParameter("maths")+
			"<li><b>PHYSICS : </b>"
			+request.getParameter("physics")+
			"<li><b>CHEMISTRY : </b>"
			+request.getParameter("chemistry")+
			 "</body>"+
			"</html>"
			);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
