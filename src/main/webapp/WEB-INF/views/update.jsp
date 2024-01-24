<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update" method="post">
<table>
      <tr>
         <td>Name:</td>
         <td><input type="text" name="name" value=<%=request.getAttribute("name")%>></td>
        
      </tr>
        <tr>
         <td>Email:</td>
         <td><input type="text" name="email"  value=<%=request.getAttribute("email")%>></td>
        
      
        <tr>
         
         <td><input type="submit" value="update"></td>
        
      </tr>


</table>


</form>

</body>
</html>