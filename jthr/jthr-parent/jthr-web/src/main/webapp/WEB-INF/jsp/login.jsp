<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">

<title>JT HR</title>
</head>

<body>
	<%@ include file="menu.jsp"%>
	<form action="login" method="POST">
		Username <input type="text" name="username" /><br> Password <input
			type="password" name="password" /><br> <input type="submit"
			value="Login">
	</form>
</body>
</html>