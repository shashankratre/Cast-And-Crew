<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,java.io.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CURRENT DATE IS</title>
</head>
<body>
<%
       Date dat = new Date();
       out.println(dat.toString());
%>
</body>
</html>