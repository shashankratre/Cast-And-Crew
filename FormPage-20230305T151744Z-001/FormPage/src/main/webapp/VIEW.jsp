<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.io.*, java.util.*,java.sql.*" %>
    <%@ page import ="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW TBLE ELEMENTS IN DATABASE</title>
</head>
<body>
<%
String driver = "net.sourceforge.jtds.jdbc.Driver";
String url ="jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\"";
String id = "capspaytraining";
String pass = "CastandCrew@98";

String sqlquery = "SELECT Name, OrderId, City, Message From FEEDBACK";
Class.forName(driver);
Connection con = DriverManager.getConnection(url,id,pass);
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sqlquery);
  

%>

<%while(rs.next()) {%><br>
Name : <%=rs.getString("Name") %><br>
ID : <%=rs.getInt("OrderId") %><br>
City : <%=rs.getString("City")%><br>
Message : <%=rs.getString("Message")%><br>
<%} %>

</body>
</html>