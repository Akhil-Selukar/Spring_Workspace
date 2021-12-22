<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking form</title>
</head>
<body>
	<h3>Railway Reservation Form</h3>
	<form:form action="submitform" modelAttribute="reservation">
		First name : <form:input path="firstName"/><br><br>
		Last name : <form:input path="lastName"/><br><br>
		Gender : Male <form:radiobutton path="gender" value="Male"/>
		Female <form:radiobutton path="gender" value="Female"/>
		<br><br>
		Meal : Breakfast<form:checkbox path="meal" value="Breakfast"/>
		Lunch<form:checkbox path="meal" value="Lunch"/>
		Dinner<form:checkbox path="meal" value="Dinner"/>
		<br><br>
		From City : <form:select path="fromCity">
			<form:option value="Wardha" label="Wardha"></form:option>
			<form:option value="Nagpur" label="Nagpur"></form:option>
			<form:option value="Pune" label="Pune"></form:option>
			<form:option value="Hyderabad" label="Hyderabad"></form:option>
		</form:select>
		<br><br>
		To City : <form:select path="toCity">
			<form:option value="Goa" label="Goa"></form:option>
			<form:option value="Shilong" label="Shilong"></form:option>
			<form:option value="Manali" label="Manali"></form:option>
			<form:option value="Mumbai" label="Mumbai"></form:option>
		</form:select>
		<br><br>
		<input type="Submit" value="Submit" />
	</form:form>
</body>
</html>