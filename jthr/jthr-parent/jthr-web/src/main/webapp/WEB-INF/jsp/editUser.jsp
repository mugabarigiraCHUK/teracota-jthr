<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
					<form action="updateuser" method="POST">
					<input type="hidden" name="user_id" value="${id}" />
						<table border="0">

							<tr>
								<td><label>First Name</label><font color="red"></font></td>
								<td><input type="text" name="userFirstname" value="${userUFirstName}"></td>
							</tr>

							<tr>
								<td><label>Last Name</label><font color="red"></font></td>
								<td><input type="text" name="userLastname" value="${userULastName}"></td>
							</tr>

							<tr>
								<td><label>Phone Number</label></td>
								<td><input type="text" name="userPhoneNumber" value="${userUPhoneNr}"></td>
							</tr>

							<tr>
								<td><label>Mobile Number</label><font color="red"></font></td>
								<td><input type="text" name="userMobilePhoneNumber" value="${userUMobileNr}"></td>
							</tr>

							<tr>
								<td><label>Email</label><font color="red"></font></td>
								<td><input type="text" name="userEmail" value="${userUEmail}"></td>
							</tr>


							<tr>
								<td><label>Job Position</label><font color="red"></font></td>
								<td><select name="function">
										<option value="Programmer">Programmer</option>
										<option value="Team-Leader">Team Leader</option>
										<option value="Department-Head">Department Head</option>
								</select></td>
							</tr>

							<tr>
								<td><label>Description</label></td>
								<td><input type="text" name="userDescription" value="${userUDescription}"></td>
							</tr>

							<tr>
								<td><label>Username</label><font color="red"></font></td>
								<td><input type="text" name="userUsername" value="${userUUsername}" readonly></td>
							</tr>

							<tr>
								<td><label>Password</label><font color="red"></font></td>
								<td>
<%-- 									<input type="text" name="userPassword" value="${userUPassword}"> --%>
										<input type="text" name="userPassword" value="">
								</td>
							</tr>

							<tr>
								<td><label>Role</label><font color="red">*</font></td>
								<td><select name="roleCB" id="rolecombobox">
									<c:forEach items="${rolList2}" var="rol">
												<option value="${rol.key}">${rol.value}</option>
											</c:forEach>
								</select></td>
								<td><div class="addGenBTN">
										<button type="button" title="Add" onclick="getFromCombo()">
											<img alt="add" src="resources/plus.png">
										</button>
										<button type="button" title="Clear" onclick="removeLastRole()">
											<img alt="remove" src="resources/minus.png">
										</button>
									</div></td>
							</tr>

							<tr>
								<td><label> </label></td>
								<td><textarea readonly name="roleResult" id="result" rows=3 cols=30></textarea></td>
							</tr>

							<tr>
								<td colspan="2"><input type="submit" value="Update" name="submit"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script>
	
		var arr = [];

		function getFromCombo() {

			var e = document.getElementById("rolecombobox");
			var strUser = e.options[e.selectedIndex].text;
			var txt = document.getElementById("result").value;
			
			arr.push(strUser);
			
			document.getElementById("result").value = arr;
		}

		function removeLastRole() {

				arr.pop();
			document.getElementById("result").value = arr;

		}
	</script>
</body>
</html>