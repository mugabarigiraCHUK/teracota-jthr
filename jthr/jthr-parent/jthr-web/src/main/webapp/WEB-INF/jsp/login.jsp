<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JTHR</title>
</head>
<body>
	<p>
	<form action="LoginServlet" method="POST">
		<table border="0">
			<tr>
				<td><label>Username:</label></td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td><label>Password:</label></td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Login"
					name="submit"> <a href="register"><input type="button"
						value="Register"></a></td>
			</tr>

			<tr>
				<td colspan="2"><p style="color: red;">${error}</p></td>
			</tr>

		</table>
	</form>
	</p>

</body>
</html>