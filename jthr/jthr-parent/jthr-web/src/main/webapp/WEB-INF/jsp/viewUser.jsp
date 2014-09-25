<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="style.css" type="text/css">
<link rel="stylesheet" href="form/form.css" type="text/css">
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
					<form action="register" method="POST">
					<input type="hidden" name="user_id" value="${userVid}" />
						<table border="0">

							<tr>
								<td><label>First Name</label><font color="red"></font></td>
								<td><input type="text" name="userFirstname" value="${userVFirstName}" disabled></td>
							</tr>

							<tr>
								<td><label>Last Name</label><font color="red"></font></td>
								<td><input type="text" name="userLastname" value="${userVLastName}" disabled></td>
							</tr>

							<tr>
								<td><label>Phone Number</label></td>
								<td><input type="text" name="userPhoneNumber" value="${userVPhoneNr}" disabled></td>
							</tr>

							<tr>
								<td><label>Mobile Number</label><font color="red"></font></td>
								<td><input type="text" name="userMobilePhoneNumber" value="${userVMobileNr}" disabled></td>
							</tr>

							<tr>
								<td><label>Email</label><font color="red"></font></td>
								<td><input type="text" name="userEmail" value="${userVEmail}" disabled></td>
							</tr>

							<tr>
								<td><label>Job Position</label><font color="red"></font></td>
								<td><input type="text" name="userJobPoz" value="${userVJobPoz}" disabled></td>
							</tr>

							<tr>
								<td><label>Description</label></td>
								<td><input type="text" name="userDescription" value="${userVDescription}" disabled></td>
							</tr>

							<tr>
								<td><label>Username</label><font color="red"></font></td>
								<td><input type="text" name="userUsername" value="${userVUsername}" disabled></td>
							</tr>

							<tr>
								<td><label>Password</label><font color="red"></font></td>
								<td><input type="text" name="userPassword" value="${userVPassword}" disabled></td>
							</tr>

							<tr>
								<td><label>Role</label><font color="red"></font></td>
								<td><input type="text" value="${userVRoles}" name="userRoleList" disabled></input></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>