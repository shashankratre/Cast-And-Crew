<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%! int i; %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>How Looping Works</title>
</head>
<body>
<%for (i =0;i<4;i++){ %>
	<font color = "red" size ="<%= i %>" > 
	HOW ARE YOU !! 
	
	</font><br />
<%} %>

</body>
</html>