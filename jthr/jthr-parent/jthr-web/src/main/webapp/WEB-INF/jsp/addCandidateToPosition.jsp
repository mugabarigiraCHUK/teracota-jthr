<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="candidate/candidateTable.css"
	type="text/css" />
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
<style>
.add {
	background:
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABhklEQVRIS72WzSsFURyGXTYKOxZCUZT/gaUoG8nGRtncjdTNR5ENNqIkslBSsrFQwgbFkn9BPjdKFCvXwsLX82pOTacz98zE3FNPZ+a8v/u+58ydMzOZksKtFrkXeqABaoLyZ/p7OIA9eIqyyUQIzYzPQR+Ueibxhb4LU3Br17oCZLoFFR5jW35jYAD2w4IdMIq4CFEr82VqNWOwbArDRv0Mbv/B3Hh+cyCvHQ2YgHqOL6DKN8WY+it1rfBoAjY5GfT8eBZ9JqhRP+2p30DPKqAR7sB3tyQN+MSzSQEjsBRj6UkDZJlTwDF0pRRwpIBraHEETFpj55yfBWPt9G2WPu/wuFRAHiodYtK9oNvTbnmZaAe6du2/BURdogVrOqecC7WOgHDJhGMFV0X5k4dJXk3pLhoqykbT5Nch61lF0o22ht/vCtRSf9gppBMOoSzG/1Go5AOxG05UVNQXjplVqq9ME1LNwTjkoNxzyd7RV0Cv2he71vc4CH+26EujLjB4oL8B72fLD37uWCkgDyeFAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

.add:hover {
	opacity: 0.5;
}

.add:active {
	opacity: 0.3;
}

tr:hover {
	background-color: #8b2d4b;
}
</style>

</head>
<body>
	<div id="main">
		<%@ include file="header.jsp"%>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="CSSTable">
					<table>
						<tr>
							<td>Last Name</td>
							<td>First Name</td>
							<td>Phone Number</td>
							<td>Mobile Number</td>
							<td>Email</td>
							<td>Address</td>
							<td>Relocation</td>
<!-- 							<td>CV</td> -->
							<td>Operations</td>
						</tr>
						<c:forEach items="${candidateList}" var="candidate">
							<tr>
								<td><c:out value="${candidate.lastName}" /></td>
								<td><c:out value="${candidate.firstName}"></c:out></td>
								<td><c:out value="${candidate.telephone}" /></td>
								<td><c:out value="${candidate.mobTelephone}"></c:out></td>
								<td><c:out value="${candidate.email}"></c:out></td>
								<td><c:out value="${candidate.address}"></c:out></td>
								<td><c:out value="${candidate.relocation}"></c:out></td>
<%-- 								<td><c:out value="${candidate.CV}"></c:out></td> --%>


								<td>
									<div style="text-align: center;">
										<form action="addcandidatetoposition" method="POST">
											<input type="hidden" name="position_id" value="<c:out value="${position_id}" />" />
											<input type="hidden" name="candidate_id" value="<c:out value="${candidate.id}" />" /> 
											<input type="submit" name="addCandidatePosition" value="" class="add" title="Add to Position" onclick="return confirm('Are you sure you want to add?')" />
										</form>
									</div>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>