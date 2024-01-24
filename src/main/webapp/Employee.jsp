<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="save" method="post">

Name:<input type="text" name="name">
Password:<input type="password" name="password">

<input type="submit" value="login">

</form>

<%
if(request.getAttribute("x")!=null){
	
	out.println(request.getAttribute("x"));
}


%>
</body>
</html>