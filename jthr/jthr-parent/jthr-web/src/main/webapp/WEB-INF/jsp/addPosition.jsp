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
					<form action="addPosition" method="POST">
						<table border="0">

							<tr>
								<td><label>Position Name</label><font color="red">*</font></td>
								<td><input type="text" name="positionName"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${firstmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Number of Persons</label><font color="red">*</font></td>
								<td><input type="text" name="nrOfPersons"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${lastmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Department</label><font color="red">*</font></td>
								<td><select name="department">
										<option value="volvo">Volvo</option>
										<option value="saab">Saab</option>
										<option value="mercedes">Mercedes</option>
										<option value="audi">Audi</option>
								</select></td>
								<!--	<td colspan="2"><p style="color:red;"> ${lastmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Project</label></td>
								<td><select name="project">
										<option value="volvo">Volvo</option>
										<option value="saab">Saab</option>
										<option value="mercedes">Mercedes</option>
										<option value="audi">Audi</option>
								</select></td>
								<!--	<td colspan="2"><p style="color:red;"> ${emailmess} </p></td> -->
							</tr>

							<tr>
								<td><label>Requirements</label><font color="red">*</font></td>
								<td><input type="text" name="requirements"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${usermess} </p></td> -->
							</tr>

							<tr>
								<td><label>Responsibilities</label><font color="red">*</font></td>
								<td><input type="text" name="responsibilities"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${passmess} </p></td> -->
							</tr>

							<tr>
								<td colspan="2"><center>
										<input type="submit" value="Add" name="submit">
									</center></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>