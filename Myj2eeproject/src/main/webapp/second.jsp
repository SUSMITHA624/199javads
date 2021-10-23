<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Page</title>
</head>
<body>
  <h3>I am from 2nd page</h3>
	<c:out value="${salary}"/>
	
	<%
	String name=request.getParameter("uname");  
	out.print("Welcome "+name); 
	

	
	pageContext.setAttribute("user", name, pageContext.PAGE_SCOPE);
	
	
	%>
	
	<%
	
	String uname=(String)pageContext.getAttribute("user",pageContext.PAGE_SCOPE);  

	out.print("Welcome "+uname);  
	
	
	
	%>
</body>
</html>