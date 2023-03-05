

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hit_Counter_Counts_no_of_visit_in_webpage
 */
@WebServlet("/Hit_Counter_Counts_no_of_visit_in_webpage")
public class Hit_Counter_Counts_no_of_visit_in_webpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	private int count;
	public void init(ServletConfig config) throws ServletException 
	{
		 count =0;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		count++;
		PrintWriter pw = response.getWriter();
		
		pw.println("Total Number of count "+count);
	}
	public void destroy() 
	{
		
	}	

}
