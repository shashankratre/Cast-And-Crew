<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XML TO JSP</title>
</head>
<body>
<h4>EMPLOYEE DETAILS OF XML FILE IN JSP PAGE</h4>
<c:import var ="ed" url="http://localhost:8080/WebProject/employee.xml"></c:import>

<x:parse xml ="${ed }" var ="output"/>
<b>First Employee Details</b>:
<x:out select= "$output/employees/employee[1]" />
<br>

<b>Second Employee Details</b>:
<x:out select= "$output/employees/employee[2]" />
<br>

</body>
</html>