
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- <%@ include file="index.html" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to JSP !!!

	<%
out.println("Welcome to the world of JSP !!!");
%>

	<% out.println(new Date()); 
	<%= new Date() %>
	
	<%! int myVariable=9999; %>
	
	<% int xyz=555; %>
	<form action="elangex.jsp" method="get">
		Student ID: <input type="text" name="sid" value=""
			placeholder="Enter ID" size="10" /> Student Name: <input type="text"
			name="sname" value="" placeholder="Enter name" size="10" /> <br>

		<input type="Submit" value="Submit" />
	</form>
	<a href="elangex.jsp">Click for EL</a>
	<br />

	<br />
	<%
	session.setAttribute("REdmiMobile", "10000");
	%>
	<br />
	<%
	Cookie ck = new Cookie("name", "abhishek");
	response.addCookie(ck);
	%>


	<c:forEach var="i" begin="1" end="10" step="1">
		<c:out value="${i}" />
	</c:forEach>

	<c:set var="fname" value="SHiva" />
	<c:out value="${fname}"></c:out>
%>
	<br/>
   <%-- The Salary is 
	<c:set var="salary" scope="application" value="${2000*2}" />
	 <jsp:forward page="second.jsp"></jsp:forward>
	<c:out value="${salary}"></c:out>
	<br />
	<br />

	

	<form action="second.jsp">
		<input type="text" name="uname"> 
		<input type="submit" value="go"><br />
	</form> --%>



	
<a href="second.jsp">Click me for 2nd page</a>
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
</body>
</html>