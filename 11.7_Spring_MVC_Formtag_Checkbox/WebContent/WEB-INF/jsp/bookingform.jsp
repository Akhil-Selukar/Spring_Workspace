<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation form</title>
</head>
<body>
	<h3>Reservation form</h3>
	<form:form action="submitForm" modelAttribute="reservation">
		First Name : <form:input path="firstName"/><br><br>
		Last Name : <form:input path="lastName"/><br><br>
		Gender : Male <form:radiobutton path="gender" value="Male"/>
		Female <form:radiobutton path="gender" value="Female"/><br><br>
		Meal : Breakfast <form:checkbox path="meal" value="Breakfast"/>
		Lunch <form:checkbox path="meal" value="Lunch"/>
		Dinner <form:checkbox path="meal" value="Dinner"/><br><br>
		
		<input type="Submit" value="Submit"/>
		
	</form:form>
</body>
</html>