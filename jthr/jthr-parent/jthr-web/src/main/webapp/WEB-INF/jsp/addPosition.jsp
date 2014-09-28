<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="position/positionForm.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>

<style>
.forma {
	width: 50%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<div id="main">
		<%@ include file="header.jsp"%>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="form">
					<form action="addposition" method="POST">
						<table border="0">
							<tr>
								<td><label>Position Name</label><font color="red">*</font></td>
								<td><input type="text" name="positionName" autofocus required></td>
							</tr>

							<tr>
								<td><label>Number of Persons</label><font color="red">*</font></td>
								<td><input type="number" name="nrOfPersons" min="1"></td>
							</tr>

							<tr>
								<td><label>Department</label><font color="red">*</font></td>
								<td><select name="department">
										<c:forEach items="${depList}" var="dep">
												<option value="${dep.key}">${dep.value}</option>
											</c:forEach>
								</select></td>
							</tr>

							<tr>
								<td><label>Project</label></td>
								<td><select name="project">
										<c:forEach items="${projList}" var="project">
											<option value="${project.key}">${project.value}</option>
										</c:forEach>
								</select></td>
							</tr>

							<tr>
								<td><label>Requirements</label><font color="red">*</font></td>
								<td><input type="text" name="requirements" required></td>
							</tr>

							<tr>
								<td><label>Responsibilities</label><font color="red">*</font></td>
								<td><input type="text" name="responsibilities" required></td>
							</tr>

							<tr>
								<td colspan="2"><center>
										<input type="submit" value="Create" name="submit">
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