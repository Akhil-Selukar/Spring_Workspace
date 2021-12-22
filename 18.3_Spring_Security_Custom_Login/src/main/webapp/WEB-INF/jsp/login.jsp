<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error{
	color:red;
}
</style>
</head>
<body>
	<c:url value="/login" var="loginUrl"></c:url>

	<form action="${loginUrl}" method="post">
		<c:if test="${param.error != null}">
			<p class="error">Invalud Username/Password!!!!!</p>
		</c:if>
		<c:if test="${param.logout != null}">
			<p class="error">You are logged out!</p>
		</c:if>
		
		<p>
			<label for="username">Username </label>
			<input type="text" id="username" name="username"/>
		</p>
		<p>
			<label for="password">password </label>
			<input type="password" id="password" name="password"/>
		</p>
		
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<button type="submit">Login</button>
	</form>
</body>
</html>