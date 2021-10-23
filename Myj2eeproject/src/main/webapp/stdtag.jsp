<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Standard Tags</title>
</head>
<body>
	<jsp:useBean id="stu" class="com.mph.model.Student">
	<jsp:setProperty property="stno" name="stu" value="4689"/>
	<jsp:setProperty property="name" name="stu" value="Ravi"/>
	</jsp:useBean>
	
	<jsp:getProperty property="stno" name="stu"/>
	<jsp:getProperty property="name" name="stu"/>
</body>
</html>