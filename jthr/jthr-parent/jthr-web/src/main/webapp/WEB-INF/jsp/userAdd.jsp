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
								<td><input type="text" id="fnameTextField" name="firstname"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${firstmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Last Name</label><font color="red">*</font></td>
								<td><input type="text" id="lnameTextField" name="lastname"></td>
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
								<td><input type="text" name="description"></td>
							</tr>

							<tr>
								<td><label>Username</label><font color="red">*</font></td>
								<td><input type="text" id="userTextField" name="username" disabled></td>
								<td><div class="addGenBTN">
										<button type="button" onclick="generateUsername()">
											<img alt="generate" src="resources/refresh.png">
										</button>
									</div></td>
								<!--	<td colspan="2"><p style="color:red;"> ${usermess} </p></td> -->
							</tr>

							<tr>
								<td><label>Password</label><font color="red">*</font></td>
								<td><input type="text" id="passTextField" name="password"></td>
								<td><div class="addGenBTN">
										<button type="button" onclick="generatePassword()">
											<img alt="generate" src="resources/refresh.png">
										</button>
									</div></td>
								<!--	<td colspan="2"><p style="color:red;"> ${passmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Role</label><font color="red">*</font></td>
								<td><select id="rolecombobox">
										<option value="generaldirector">General-Director</option>
										<option value="departmentdirector">Department-Director</option>
										<option value="hrdirector">HR-Director</option>
										<option value="recruiter">Recruiter</option>
										<option value="admin">Application-Admin</option>
										<option value="viewer">Viewer</option>
								</select></td>
								<td><div class="addGenBTN">
										<button type="button" onclick="getFromCombo()">
											<img alt="add" src="resources/plus.png">
										</button>
										<button type="button" onclick="removeLastRole()">
											<img alt="remove" src="resources/minus.png">
										</button>
									</div></td>
							</tr>

							<tr>
								<td><label> </label></td>
								<td><textarea disabled name="Address" id="result" rows=3 cols=30></textarea></td>
							</tr>

							<tr>
								<td colspan="2"><input type="submit" value="Add"
									name="submit"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script>
		function getFromCombo() {

			var e = document.getElementById("rolecombobox");
			var strUser = e.options[e.selectedIndex].text;
			var txt = document.getElementById("result").value;
			if (txt.length == 0)
				txt = txt + "[" + strUser + "]";
			else
				txt = txt + " [" + strUser + "]";
			document.getElementById("result").value = txt;
		}

		function removeLastRole() {

			var aux = "";
			var roles = document.getElementById("result").value;
			var rolesArray = roles.split(" ");
			rolesArray.pop();
			for (i = 0; i < rolesArray.length; i++)
				if (aux.length == 0) {
					aux = aux + rolesArray[i];
				} else {
					aux = aux + " " + rolesArray[i];
				}
			document.getElementById("result").value = aux;

		}

		function generateUsername() {

			var fname = document.getElementById("fnameTextField").value;
			var lname = document.getElementById("lnameTextField").value;
			if (fname.length == 0 || lname.length == 0)
				alert("Please complete First Name and Last Name fields !");
			else {
				var faux = fname.toLowerCase();
				var laux = lname.toLowerCase();
				var username = laux.substring(0, 5) + faux.substring(0, 1);
				document.getElementById("userTextField").value = username;
			}

			alert("Este : " + username + " " + username.length);

		}

		function generatePassword() {

			var password = document.getElementById("lnameTextField").value
					.toLowerCase();
			document.getElementById("passTextField").value = password;

		}
	</script>
</body>
</html>