<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="user/userTable.css" type="text/css" />
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
</head>
<body>
	<div id="main">
		<%@ include file="header.jsp" %>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="CSSTable">
					<table>
						<tr>
							<td>Select</td>
							<td>First Name</td>
							<td>Last Name</td>
							<td>Phone Number</td>
							<td>Mobile Number</td>
							<td>E-mail</td>
							<td>Job Position</td>
							<td>Description</td>
						</tr>
						<tr>
							<td><input type="checkbox" name="vehicle" value="Bike"></td>
							<td>Adam</td>
							<td>Gazsi</td>
							<td>0987654432</td>
							<td>0712383746</td>
							<td>adam@adam.ciolo</td>
							<td>Boss</td>
							<td>Teracota Dreamer</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>