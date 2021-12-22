<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="helloagain" modelAttribute="emp">
	First Name : <form:input path="firstName" />
		<br>
		<br>
	Last Name : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>