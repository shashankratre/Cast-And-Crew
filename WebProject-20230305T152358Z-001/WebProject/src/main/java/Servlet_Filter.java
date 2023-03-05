

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class Servlet_Filter
 */
@WebFilter("/Servlet_Filter")
public class Servlet_Filter extends HttpFilter implements Filter 
{

	private static final long serialVersionUID = 1L;
	
	public void init(FilterConfig fConfig) throws ServletException 
	{
		String paramname = fConfig.getInitParameter("FIRST-FILTER");
		
		
		System.out.println("First parameter name "+ paramname);
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		
		String ipaddress = request.getRemoteAddr();
		
		System.out.println("IP ADDRESS IS :"+ ipaddress);
		chain.doFilter(request, response);
	}

	public void destroy() 
	{
		
	}
}
