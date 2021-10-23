<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
	<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver"
	 url="jdbc:oracle:thin:@localhost:1521:XE" user="system" password="susmitha"/>

	<sql:query var="rs" dataSource="${ds}">
		select * from mphemp
	</sql:query>
	
	<sql:update var="noofrows" dataSource="${ds}">
		insert into mphemp values(15,'priya')
	</sql:update>
	<table>
		<tr>
			<th>Emp Number</th>
			<th>Emp Name</th>
		</tr>	
		<c:forEach var="row" items="${rs.rows}">
		<tr>
			<td><c:out value="${row.empno}"></c:out></td>
			<td><c:out value="${row.ename}"></c:out></td>
		</tr>
	
	</c:forEach>
	
	</table>

	


</body>
</html>
