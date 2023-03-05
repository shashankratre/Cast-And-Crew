import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Read_Cookie")
public class Read_Cookie extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie[] c2 = null;
		 c2 = request.getCookies();
		 
		 response.setContentType("text/html");
		 
		 PrintWriter pw = response.getWriter();
		 for(int i =0;i<c2.length;i++)
		 {
			
			 pw.println("Cookie Name : " + c2[i].getName()+", ");
			 pw.println("Cookie Value : " +c2[i].getValue()+"<br />");
		 }
		 
	}

}
