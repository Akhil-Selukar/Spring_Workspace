<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Booking</title>
</head>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First name : ${reservation.firstName}
	<br> Last name : ${reservation.lastName}
	<br> Gender : ${reservation.gender}
	<br> Meal :
	<ul>
		<c:forEach var="m" items="${reservation.meal}">	
			<li>${m}</li>
		</c:forEach>
	</ul>
	From city : ${reservation.fromCity}<br>
	To City : ${reservation.toCity}
</body>
</html>