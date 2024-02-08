<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Welcome to Login JSP Page</h1>
	<form action="reg" method="post">
		<label for="tbEmailLog">Email:</label>
		<input type="email" id="tbEmailLog" name="tbEmailLog" value=<%= request.getParameter("tbEmail") %> required="required">
		<br>
		<label for="tbPwdLog">Password:</label>
		<input type="password" id="tbPwdLog" name="idPwdLog"  value=<%= request.getParameter("tbPwd") %> required="required">
		<br>
		<button>login</button>
	</form>
</body>
</html>