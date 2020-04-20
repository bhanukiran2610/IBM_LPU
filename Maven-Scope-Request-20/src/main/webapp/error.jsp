<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
//scriptlet
List<String> list=(List<String>)request.getAttribute("error");
for(String l:list)
{
	out.println(l+"<br/>");
	
}

out.println("Error Occurred..!!");
%>

</body>
</html>