<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Employee</title>
</head>
<body>
	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<c:forEach var="emp" items="${msg}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="/13.0_Spring_MVC_Pagination/viewemp/1">1</a>
	<a href="/13.0_Spring_MVC_Pagination/viewemp/2">2</a>
	<a href="/13.0_Spring_MVC_Pagination/viewemp/3">3</a>
	<a href="/13.0_Spring_MVC_Pagination/viewemp/4">4</a>
	<a href="/13.0_Spring_MVC_Pagination/viewemp/5">5</a>
</body>
</html>