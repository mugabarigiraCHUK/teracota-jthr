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
						<table border="0">

							<tr>
								<td><label>First Name</label><font color="red">*</font></td>
								<td><input type="text" name="firstname"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${firstmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Last Name</label><font color="red">*</font></td>
								<td><input type="text" name="lastname"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${lastmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Phone Number</label></td>
								<td><input type="text" name="phoneNumber"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${firstmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Mobile Number</label><font color="red">*</font></td>
								<td><input type="text" name="mobilePhoneNumber"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${lastmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Email</label><font color="red">*</font></td>
								<td><input type="text" name="email"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${emailmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Job Position</label><font color="red">*</font></td>
								<td><select>
										<option value="programmer">Programmer</option>
										<option value="teamleader">Team Leader</option>
										<option value="departmenthead">Department Head</option>
								</select></td>
							</tr>

							<tr>
								<td><label>Description</label></td>
								<td><input type="password" name="description"></td>
							</tr>

							<tr>
								<td><label>Username</label><font color="red">*</font></td>
								<td><input type="text" name="username"></td>
								<td><div class="round-button">
										<a href="login1"> <img
											src="resources/refresh.png" />
										</a>
										<div></td>
								<!--	<td colspan="2"><p style="color:red;"> ${usermess} </p></td> -->
							</tr>

							<tr>
								<td><label>Password</label><font color="red">*</font></td>
								<td><input type="password" name="password"></td>
								<td><div class="round-button">
										<a href="login2"> <img src="resources/refresh.png" />
										</a>
										<div></td>
								<!--	<td colspan="2"><p style="color:red;"> ${passmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Role</label><font color="red">*</font></td>
								<td><select>
										<option value="generaldirector">General Director</option>
										<option value="departmentdirector">Department
											Director</option>
										<option value="hrdirector">HR Director</option>
										<option value="recruiter">Recruiter</option>
										<option value="admin">Application Admin</option>
										<option value="viewer">Viewer</option>
								</select></td>
								<td><div class="round-button">
										<a href="login333333333"> <img
											src="resources/plus.png" />
										</a>
										</div></td>
							</tr>

							<tr>
								<td><label> </label></td>
								<td><input type="text" name="rolelist" disabled></td>
							</tr>

							<tr>
								<td colspan="2"><input type="submit" value="Add"
									name="submit"></td>
							</tr>

							<tr>
								<!--	<td colspan="2"><p style="color:red;"> ${regmess} </p></td> -->
							</tr>

						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>