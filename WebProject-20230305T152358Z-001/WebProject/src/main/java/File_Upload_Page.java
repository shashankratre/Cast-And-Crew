

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;


@WebServlet("/File_Upload_Page")
public class File_Upload_Page extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	
	private boolean isMultipart;
	private String filepath;
	private File file;
	private int MaxFileSize = 5000*1024;
	private int maxMemSize = 500*1024;
	
	
	public void init() 
	{
		filepath = getServletContext().getInitParameter("file-upload");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		isMultipart = ServletFileUpload.isMultipartContent(request);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if(!isMultipart)
		{
			  pw.println("<html>");
		         pw.println("<head>");
		         pw.println("<title>Servlet File Upload</title>");  
		         pw.println("</head>");
		         pw.println("<body>");
		         pw.println("<p>No file uploaded</p>"); 
		         pw.println("</body>");
		         pw.println("</html>");
			return;
		}
		DiskFileItemFactory fac = new  DiskFileItemFactory();
		
		fac.setSizeThreshold(maxMemSize);
		fac.setRepository(new File("C:\\Users\\sratre\\Downloads\\formdata"));
		
		ServletFileUpload upload = new ServletFileUpload(fac);
		upload.setSizeMax(MaxFileSize);
		try 
		{
			List<FileItem> fileitem = upload.parseRequest(new ServletRequestContext(request));
			Iterator it = fileitem.iterator();
			pw.println("<html>");
	         pw.println("<head>");
	         pw.println("<title>Servlet File Upload</title>");  
	         pw.println("</head>");
	         pw.println("<body>");
	         while(it.hasNext())
	         {
	        	 FileItem fi =(FileItem)it.next();
	        	 if(!fi.isFormField())
	        	 {
	        		 String fieldName = fi.getFieldName();
	                 String fileName = fi.getName();
	                 String contentType = fi.getContentType();
	                 boolean isInMemory = fi.isInMemory();
	                 long sizeInBytes = fi.getSize();
	                 
	                 if( fileName.lastIndexOf("\\") >= 0 ) 
	                 {
	                     file = new File( filepath + fileName.substring( fileName.lastIndexOf("\\"))) ;
	                  } 
	                 else
	                  {
	                     file = new File( filepath + fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	                  }
	                  fi.write( file ) ;
	                  pw.println("Uploaded Filename: " + fileName + "<br>");
	        	 }
	         }
	         pw.println("</body>");
	         pw.println("</html>");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
}
