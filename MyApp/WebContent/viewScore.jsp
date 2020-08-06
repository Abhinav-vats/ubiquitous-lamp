<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="color: red;">Your score is : <%= session.getAttribute("score") %></div>
	<div style="color: green;">Your session id was : <%= session.getId() %></div>
	<div style="color: blue;">Your session is closed : <%session.invalidate(); %></div>
</body>
</html>