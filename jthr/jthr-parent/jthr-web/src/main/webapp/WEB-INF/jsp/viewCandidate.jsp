<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

.comment-username {
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
<body>
	<div id="main">
		<%@ include file="header.jsp"%>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="form">
					<form action="viewcandidate" method="POST">
						<input type="hidden" name="candidate_id" value="${id}" />
						<table border="0">
							<tr>
								<td><label>Last Name</label><font color="red">*</font></td>
								<td><input type="text" name="lastName" value="${lastName}"
									disabled></td>
							</tr>

							<tr>
								<td><label>First Name</label><font color="red">*</font></td>
								<td><input type="text" name="firstName"
									value="${firstName}" disabled></td>
							</tr>

							<tr>
								<td><label>Telephone</label><font color="red">*</font></td>
								<td><input type="text" name="telephone"
									value="${telephone}" disabled></td>
							</tr>

							<tr>
								<td><label>Mobile Telephone</label></td>
								<td><input type="text" name="mobTelephone"
									value="${mobTelephone}" disabled></td>
							</tr>

							<tr>
								<td><label>Email</label></td>
								<td><input type="text" name="email"
									value="${email}" disabled></td>
							</tr>
							
							<tr>
								<td><label>Address</label><font color="red">*</font></td>
								<td><input type="text" name="address" value="${address}"
									disabled></td>
							</tr>

							<tr>
								<td><label>CV</label><font color="red">*</font></td>
								<td><input type="text" name="cv" value="${cv}" disabled></td>
							</tr>
							
							<tr>
								<td><label>Request Relocation</label></td>
								<td><input type="checkbox" name=relocation
									value="relocation"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${lastmess} </p></td> -->
							</tr>
							
							<tr>
								<td><label>Date</label><font color="red">*</font></td>
								<td><input type="text" name="date" value="${date}" disabled></td>
							</tr>
							
						</table>
					</form>
				</div>

				<div id="comments-container">
					<div class="comment">
						<div class="comment-username">rrrrazvan</div>
						<div class="comment-buttons">button</div>
						<div class="comment-text">comment text</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</body>

</html>