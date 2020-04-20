<%@page import="com.example.model.ToDo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//scriptlet
ToDo todo=(ToDo)request.getAttribute("todo");
out.println("JSP Page");%>
<br>
<% 
out.println();
out.println(todo.getId()+" , "+todo.getName()+" , "+todo.getCompletedBy());
%>

</body>
</html>