<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Logged In</title>
</head>
<body>
<table style="with: 50%">
	<tr><td>
	<% String username = request.getParameter("uname"); %>
<a>Welcome   <% out.println(username); %>!!!! You have logged in.</a></td></tr>
<tr></tr><tr><td></td><td></td><td><a href="loginpage.jsp"><b>Logout</b></a></td></tr>
</table>
</body>
</html>