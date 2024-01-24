<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menue.jsp" %>    
<%@ include file="tags.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="store" method="post">
<table>
      <tr>
         <td>Name:</td>
         <td><input type="text" name="name"></td>
        
      </tr>
        <tr>
         <td>City:</td>
         <td><input type="text" name="city"></td>
        
      </tr>
        <tr>
         <td>Email:</td>
         <td><input type="text" name="email"></td>
        
      </tr>
        <tr>
         <td>Post:</td>
         <td><input type="text" name="post"></td>
        
      </tr>
        <tr>
         
         <td><input type="submit"></td>
        
      </tr>


</table>


</form>
<%
if(request.getAttribute("x")!=null){
	
	out.println(request.getAttribute("x"));
}


%>
</body>
</html>