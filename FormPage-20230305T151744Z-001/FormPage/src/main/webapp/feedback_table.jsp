<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" %>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack Table</title>
</head>
<body>
<%!
final String driver = "net.sourceforge.jtds.jdbc.Driver";
final String url = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\"";
final String user = "capspaytraining";
final String pass = "CastandCrew@98";
%>
 <% 
 Connection c = null;
 Statement st = null;
	try
	{
	Class.forName(driver);
	c = DriverManager.getConnection(url, user, pass);
	st = c.createStatement();
	String sql ="Create Table FEEDBACK(Name varchar(255) not Null, OrderId int, City varchar(255),Message varchar(255), primary key(OrderId)); ";
	st.executeUpdate(sql);
	%>
	<table align="center" style ="background-color :#00FFFF;">
	<tr><td align ="center" ><font size="+3" color ="red">Congratulations !</font></td>
	<tr><td align="center" ><font size="+2">Table of Specified Name Is Created Successfully.</font></td></tr>
    </tr>
	
	<% }catch(Exception e){%>
	<table border = "0" align="center" style ="background-color :#DC143C;">
	<tr><td align="center" ><font size="+2">Table Already Created.</font></td></tr>
	
	 
 <%} finally {
 c.close();
 st.close();
 }%>
 <tr><td align ="center">
 <a href = "CreateTable.jsp">
 <font  size="5" color="green">Back To Home-page</font>
 </a>
 </td>
 </tr>
 </table>
 </table>

</body>
</html>