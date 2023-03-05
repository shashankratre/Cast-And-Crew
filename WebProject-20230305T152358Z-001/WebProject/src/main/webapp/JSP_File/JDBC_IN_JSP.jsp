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

String sqlquery = "SELECT Employee_Id, Employee_Name,Salary From Employee";
Class.forName(driver);
Connection con = DriverManager.getConnection(url,id,pass);
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sqlquery);
  

%>
<%while(rs.next()) {%><br>
EMP ID : <%=rs.getInt("Employee_Id") %><br>
EMP NAME : <%=rs.getString("Employee_Name") %><br>
EMP SALARY : <%=rs.getInt("Salary")%><br>
<%} %>
</body>
</html>