<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="user/userTable.css" type="text/css" />
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
</head>
<body>
	<div id="main">
		<%@ include file="header.jsp" %>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="CSSTable">
					<table>
						<tr>
							<td>Select</td>
							<td>First Name</td>
							<td>Last Name</td>
							<td>Phone Number</td>
							<td>Mobile Number</td>
							<td>E-mail</td>
							<td>Job Position</td>
							<td>Description</td>
						</tr>
						<c:forEach items="${list}" var="user">
							<tr>
								<td><input type="checkbox" name="blabal" value="BOSS"></td>
								<td><c:out value="${user.firstName}"></c:out></td>
								<td><c:out value="${user.lastName}" /></td>
								<td><c:out value="${user.phoneNumber}" /></td>
								<td><c:out value="${user.mobilePhoneNumber}"></c:out></td>
								<td><c:out value="${user.email}"></c:out></td>
								<td><c:out value="${user.jobPozition}"></c:out></td>
								<td><c:out value="${user.description}"></c:out></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>