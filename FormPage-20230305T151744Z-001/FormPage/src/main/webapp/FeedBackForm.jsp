<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*" %>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack Form Page</title>
</head>
<body>
<%!
final String driver = "net.sourceforge.jtds.jdbc.Driver";
final String url = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\"";
final String user = "capspaytraining";
final String pass = "CastandCrew@98";
%>
<%
Connection con = null;
Statement st = null;
ResultSet rs = null;

try
{
	Class.forName(driver);
	con = DriverManager.getConnection(url, user, pass);
	st = con.createStatement();	
}
catch (Exception e)
{
	System.out.println(e.getMessage());
}
if(request.getParameter("action")!=null){
	String name = request.getParameter("name");
	long number =Integer.parseInt(request.getParameter("number"));
	
	String city = request.getParameter("city");
	String msg = request.getParameter("msg");
	String sql = "INSERT INTO FEEDBACK(Name,OrderId,City,Message) VALUES('"+name+"','"+number+"','"+city+"','"+msg+"')";
	st.executeUpdate(sql);
	rs = st.executeQuery("SELECT * From FEEDBACK");
}
con.close();
st.close();
%>
<script language="java"></script>
<form action="FeedBackForm.jsp" method="post" name="entry" onsubmit="return validate(this)" >
<input type="hidden" value="list" name="action">
<table>
<tr><td  colspan="2" align ="center"><h3>FEEDBACK FORM PAGE</h3></td></tr>
<tr><td>Enter Name : </td><td><input name="name" type="text" size="50" ></td></tr>

<tr><td>Enter OrderId : </td><td><input name="number" type="number" size="50"></td></tr>

<tr><td>Enter City : </td><td><input name="city" type="text" size ="50"></td></tr>

<tr><td>Enter Feedback : </td><td><input name="msg" type="text" size="50"></td></tr>

<tr><td colspan="2" align="center"><input type="submit" value="Submit"></td></tr>

</table>
</form>
</body>
</html>