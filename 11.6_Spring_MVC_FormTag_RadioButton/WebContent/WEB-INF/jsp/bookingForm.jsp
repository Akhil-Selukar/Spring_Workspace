<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking page</title>
</head>
<body>
	<h3>Reservation form</h3>
	<form:form action="submitForm" modelAttribute="reservation">
	First name : <form:input path="firstName" /><br><br>
	Last name : <form:input path="lastName" /><br><br>
	Gender:
	Male <form:radiobutton path="gender" value="Male" />
	Female <form:radiobutton path="gender" value="Female" />
		<br><br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>