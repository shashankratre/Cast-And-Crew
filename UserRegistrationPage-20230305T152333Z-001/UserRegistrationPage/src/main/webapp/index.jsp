<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<form action="RegistrationPage" method="post">
<table style ="width : 50% " >
<tr><td colspan="2" align ="center"><h3>User Registration Page</h3></td></tr>
<tr>
<td>First Name</td>
<td><input type="text" name ="fname" size="50" /></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name ="lname" size="50" /></td>
</tr>
<tr>
<td>UserName</td>
<td><input type="text" name ="uname" size="50" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name ="pass" size="50" /></td>
</tr>
<tr>
<td>Contact</td>
<td><input type="text" name ="contact" size="50" /></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name ="address" size="50" /></td>
</tr>
<tr>
<td colspan="2" align ="center"><input  type="submit" value="Submit" /></td>
</tr>
</table>
</form>
</body>
</html>