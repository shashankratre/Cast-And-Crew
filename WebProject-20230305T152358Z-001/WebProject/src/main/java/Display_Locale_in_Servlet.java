

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display_Locale_in_Servlet
 */
@WebServlet("/Display_Locale_in_Servlet")
public class Display_Locale_in_Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Locale l = response.getLocale();
		String language = l.getLanguage();
		String langdisplay = l.getDisplayLanguage();
		String lanISO = l.getISO3Language();
		String country = l.getCountry();
	    String counISO =	l.getISO3Country();
	    String countrydisplay = l.getDisplayCountry();
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println(language);
		pw.println(langdisplay);
		pw.println(lanISO);
		
		pw.println(country);
		pw.println(countrydisplay);
		pw.println(counISO);
		
		response.setHeader("Content-Language", "es");
		
	}

}
