<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.io.*, java.util.*,java.sql.*" %>
    <%@ page import ="javax.servlet.http.*,javax.servlet.*" %>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "sql" uri="http://java.sun.com/jsp/jstl/sql" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SELECT OPERATION IN JSP PAGE</title>
</head>
<body>
<sql:setDataSource var ="snapshot" driver ="net.sourceforge.jtds.jdbc.Driver"
url = "jdbc:jtds:sqlserver://cpas-db-dev1.dev.aws.castandcrew.com;DatabaseName=CapspayTraining;Trusted_Connection=False\""
     user = "capspaytraining" password ="CastandCrew@98"/>
     
 <sql:query dataSource= "${snapshot}"  var = "result" >
 SELECT * From Employee;
 </sql:query>
  <table border = "1" width = "100%">
         <tr>
            <th>Employee_Id</th>
            <th>Employee_Name</th>
            <th>Salary</th>
            <th>Department_Id</th>
         </tr>
          <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.Employee_Id}"/></td>
               <td><c:out value = "${row.Employee_Name}"/></td>
               <td><c:out value = "${row.Salary}"/></td>
               <td><c:out value = "${row.Department_Id}"/></td>
            </tr>
         </c:forEach>
      </table>
</body>
</html>