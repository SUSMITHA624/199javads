<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="errpage.jsp"%>
<%@page import="com.mph.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Page </title>
</head>
<body>

	<% 
	Student st = new Student();
	int sid = Integer.parseInt(request.getParameter("sid"));
	String sname = request.getParameter("sname");
	
	if(!(sid ==0  && sname.length() == 0) || !(sname.equals(null))){
		st.setStno(sid);
		st.setName(sname);
	}
	%>
	
	SID : <%= st.getStno()   %>
	SNAME : <%=st.getName() %>
	<% 
	if((sid ==0  && sname.length() == 0) || sname.equals(null)){
		throw new Exception();
	}
	
	%>
	<%
		String counterAttribute = (String)session.getAttribute("counter");
	int count=0;
	try{
		count= Integer.parseInt(counterAttribute);
			
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	count++;
	session.setAttribute("counter", Integer.toString(count));
	out.println("This is the " + count + "th time you are visiting this page ");
	
	%>
	
	
	
</body>
</html>