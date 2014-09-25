<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="form/form.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<!-- <link rel="stylesheet" href="user/userTable.css" type="text/css" /> -->
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
<style>
#comment-container {
	width: 520px;
	border: 1px solid;	
}

.comment {
	border: 3px solid #dbdbdb;
}

.comment-username{
	float: left;
}

.comment-buttons {
	float: right;
}

.comment-text {
	clear: both;
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
					<form action="editposition" method="POST">
						<input type="hidden" name="position_id" value="${positionId}" />
						<table border="0">
							<tr>
								<td><label>Position Name</label><font color="red">*</font></td>
								<td><input type="text" name="positionName" value="${positionName}"  disabled></td>
							</tr>

							<tr>
								<td><label>Number of Persons</label><font color="red">*</font></td>
								<td><input type="text" name="nrOfPersons" value="${positionNrOfPlaces}" disabled></td>
							</tr>

							<tr>
								<td><label>Department</label><font color="red">*</font></td>
								<td><input type="text" name="department" value="${positionDepartment}" disabled></td>
							</tr>

							<tr>
								<td><label>Project</label></td>
								<td><input type="text" name="project" value="${positionProject}" disabled></td>
							</tr>

							<tr>
								<td><label>Requirements</label><font color="red">*</font></td>
								<td><input type="text" name="requirements" value="${positionRequirements}" disabled></td>
							</tr>

							<tr>
								<td><label>Responsibilities</label><font color="red">*</font></td>
								<td><input type="text" name="responsibilities" value="${positionResponsibilities}" disabled></td>
							</tr>
						</table>
					</form>
				</div>

				<div id="comments-container">
					<div class="comment">
						<div class="comment-username">Gazsi Adam</div>
						<div class="comment-buttons">button</div>
						<div class="comment-text">comment text</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>