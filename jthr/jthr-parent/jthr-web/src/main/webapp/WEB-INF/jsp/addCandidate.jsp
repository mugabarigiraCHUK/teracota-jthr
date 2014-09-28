<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="form/form.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<!-- <link rel="stylesheet" href="user/userTable.css" type="text/css" /> -->
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
</head>
<body>
	<div id="main">
		<%@ include file="header.jsp"%>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="form">
					<form action="addcandidate" method="POST" enctype="multipart/form-data">
						<table border="0">

							<tr>
								<td><label>Last Name</label><font color="red">*</font></td>
								<td><input type="text" name="lastName"></td>
							</tr>

							<tr>
								<td><label>First Name</label><font color="red">*</font></td>
								<td><input type="text" name="firstName"></td>
							</tr>

							<tr>
								<td><label>Telephone</label></td>
								<td><input type="text" name="telephone"></td>
							</tr>

							<tr>
								<td><label>Mobile Telephone</label><font color="red">*</font></td>
								<td><input type="text" name="mobileTelephone"></td>
							</tr>
							<tr>
								<td><label>Email</label><font color="red">*</font></td>
								<td><input type="text" name="email"></td>
							</tr>
							<tr>
								<td><label>Address</label></td>
								<td><input type="text" name="address"></td>
							</tr>

							<tr>
								<td><label>Request Relocation</label></td>
								<td><input type="checkbox" name=relocation value="relocation"></td>
							</tr>

							<tr>
								<td><label>CV</label><font color="red">*</font></td>
								<td><input type="file" name="cv" value="${cv}" required></td>
							</tr>

							<tr>
								<td colspan="2">
									<center>
										<input type="submit" value="Add" name="submit">
									</center>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>