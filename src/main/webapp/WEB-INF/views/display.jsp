<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border='3'>
      <tr>
          <th>Name</th>
          <th>City</th>
          <th>Email</th>
          <th>Post</th>
          <th>Delete</th>
          <th>Update</th>
      </tr>
<%
ResultSet result= (ResultSet)request.getAttribute("res");
while(result.next()){%>
	
	  <tr>
      <td><%=result.getString(1)%></td>
      <td><%=result.getString(2)%></td>
      <td><%=result.getString(3)%></td>
      <td><%=result.getString(4)%></td>
      <td><a href="delete?name=<%=result.getString(1)%>">delete</a></td>
      <td><a href="update?name=<%=result.getString(1)%>&email=<%=result.getString(3)%>">update</a></td>
  </tr>
	
<%}


%>


</table>

</body>
</html>