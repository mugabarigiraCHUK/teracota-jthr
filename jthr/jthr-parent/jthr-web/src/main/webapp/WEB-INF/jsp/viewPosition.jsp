<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="position/positionForm.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<!-- <link rel="stylesheet" href="user/userTable.css" type="text/css" /> -->
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
<style>
#comment-container {
	margin-top: 250px;
	min-width: 520px;
	border: 1px solid;	
}

.comment {
	margin-top: 10px;
    margin-left: auto;
	margin-right: auto;
	max-width: 500px;
	border: 3px solid #b5b5b5;
	background-color: #b5b5b5;
	padding-bottom: 5px;
}

.comment-username{
	padding: 10px;
	float: left;
	background-color: #b5b5b5;
}

.comment-buttons {
	padding: 10px;
	float: right;
	background-color: #b5b5b5;
}

.comment-text {
	padding: 10px;
	clear: both;
	min-height: 50px;
	background-color: white;
	margin-right: 5px;
	margin-left: 5px;
}

<!-- .submit-comment-button:hover {
	opacity: 0.7;
} -->

.delete {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA0AAAAQCAYAAADNo/U5AAABXklEQVQoU23STShEURjGcbPwsRiKUiwopWwkCguyQTaifC3YICUfJSVKWShRY2UUWQ4hydeCkpISxYqNlIWyIMnKSGzwf+qceme49et933PPc2fu6QYS/l6JLLUhCZ/YxLfdFmCIIGgW0+mrzXxEHzVzVKGtuNA/Px6z9KZQMfrc8iq1EWlYwCBecIZmtyesUAXO3cIYtRf5aMIurnCIcbenSKFcPLiFGWodSk3ohP4WA25PhkI6rS+oX0QBakxoj/4DHa4GtVHXE7KxhhS0mFCEPhP1uNNDfeiSoRwHeEaPCc3Rl6ESx6j1oW0GnY4O5AIjJjRJ34pCLKPLh8IMQ7jBBqZMaNg9JIc6jQkfGmWYxSNCmDehbjenUvux5EPtDOt4h452xYT01/TV6GrAvg9VMZy6G3q3HRPys26X4NqH8hjuXUgv24n4qts6+lcfSmbQUfvZ5WOKPoAs/PwCO89NwuUnX60AAAAASUVORK5CYII=);
	width: 13px;
	height: 16px;
	border: none;
	margin-left: 5px;
}

.delete:hover{
	opacity: 0.5;
}

.delete:active{
	opacity: 0.3;
}

.edit {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA/klEQVQ4T2NkIA3oAJVXAXEREL8AaWUkQb82UO1+IBYF4utA7AjEL4k1QBWoWByINwOxANTSayBDiDFAF6hwLxCfA+IWNEOWETIA5Od9UGeDLN6JZMhfINsZnwHommHBBTPkM1DgIi4DcGkGGfIOiK2B+AauWEAObfRIAml2AeLzMAl0F5CkGd0FIM2gABNDtxbqbGcgfQFdDuYCRaDECRya30KdjaEZ2QV+QE4CEAei2YBXM8wAWSDjLhDHAHEEkiEgzSBnX8TiJbgQyAueQLwNiH8jGWJHjGaYC0qBjC6okSBDQoH4KhDfwWczTA7kglgglgLiy1D8mBiNMDUAwLIz+5GDo0MAAAAASUVORK5CYII=);
	width: 16px;
	height: 16px;
	border: none;
}

.edit:hover{
	opacity: 0.5;
}

.edit:active{
	opacity: 0.3;
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
					<c:forEach items="${comments}" var="comm">
						<div class="comment">
							<div class="comment-username">"${comm.user.name}"</div>
							
							<c:if test="${comm.user.id == userId}"> <!-- userId should be obtained from session -->
								<div class="comment-buttons">
									<form action="/viewposition" method="POST">
										<input type="hidden" name="comment_id" value="<c:out value="${comm.id}" />"/>
										<input type="submit" value="" name="editComment" title="Edit" class="edit"/>
										<input type="submit" value="" name="deleteComment" title="Delete" class="delete"/>
									</form>
								</div>
							</c:if>
							<div class="comment-text">"${comm.text}"</div>
						</div>
					</c:forEach>							
				</div>
			</div>
		</div>
	</div>

</body>
</html>