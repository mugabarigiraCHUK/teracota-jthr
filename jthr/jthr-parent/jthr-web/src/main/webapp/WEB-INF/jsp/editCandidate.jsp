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
</style>
</head>
<body>
	<div id="main">
		<%@ include file="header.jsp"%>
		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="form">
					<form action="editcandidate" method="POST">
						<input type="hidden" name="candidate_id" value="${candidateId}" />
						<table border="0">

							<tr>
								<td><label>Last Name</label><font color="red">*</font></td>
								<td><input type="text" name="lastName" value="${lastName}"></td>
							</tr>

							<tr>
								<td><label>First Name</label><font color="red">*</font></td>
								<td><input type="text" name="firstName"
									value="${firstName}"></td>
							</tr>

							<tr>
								<td><label>Telephone</label><font color="red">*</font></td>
								<td><input type="text" name="telephone"
									value="${telephone}"></td>
							</tr>

							<tr>
								<td><label>Mobile Telephone</label></td>
								<td><input type="text" name="mobTelephone"
									value="${mobTelephone}"></td>
							</tr>

							<tr>
								<td><label>Email</label><font color="red">*</font></td>
								<td><input type="text" name="email" value="${email}"></td>
							</tr>

							<tr>
								<td><label>Address</label><font color="red">*</font></td>
								<td><input type="text" name="address" value="${address}"></td>
							</tr>

							<tr>
								<td><label>Request Relocation</label></td>
								<td><input type="checkbox" name=relocation
									value="relocation"></td>
								<!--	<td colspan="2"><p style="color:red;"> ${lastmess} </p></td> -->
							</tr>

							<tr>
								<td><label>CV</label><font color="red">*</font></td>
								<td><input type="file" name="cv" value="${cv}" required></td>
							</tr>
							<tr>
								<td><label>Interviews</label><font color="red">*</font></td>
								<td><input type="date" name="interview" id="interview"></td>
								<td><div class="round-button">
										<button type="button" title="Add" onclick="addInterview()">
											<img alt="add" src="resources/plus.png">
										</button>
									</div></td>
							</tr>
							<tr>
								<td><label> </label></td>
								<td><input type="text" name="interviews"
									id="
									interviews" value="${interviews}"></td>
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
			<div id="comments-container">
				<c:forEach items="${comments}" var="comm">
					<div class="comment">
						<div class="comment-username">
							<c:out value="${comm.user.firstName}" />
							<c:out value="${comm.user.lastName}" />
						</div>
						<form action="editcandidate" method="POST"
							id="comment__${comm.id}">
							<c:if test="${comm.user.id == user_id}">
								<!-- userId should be obtained from session -->
								<div class="comment-buttons">

									<input type="hidden" name="comment_id"
										value="<c:out value="${comm.id}" />" /> <input type="hidden"
										name="candidate_id" value="${candidateId}" /> <input
										type="button" value="" class="edit"
										onclick="toggle_visibility('comment_${comm.id}')" /> <input
										type="submit" value="" name="deleteComment" title="Delete"
										class="delete" />

								</div>
							</c:if>
							<div class="comment-text">
								<textarea id="comment_${comm.id}_text" name="comment_text"
									form="comment__${comm.id}" rows="4" cols="65" readonly>${comm.text}</textarea>
								<br> <input id="comment_${comm.id}_editbutton"
									type="submit" value="Submit" name="editComment" title="Edit"
									disabled />
							</div>
						</form>
					</div>
				</c:forEach>

				<div class="comment">
					<div class="comment-username">Post Comment:</div>
					<form id="postcomment" action="editcandidate" method="POST">
						<input type="hidden" name="candidate_id" value="${candidateId}" />
						<div class="comment-text">
							<textarea name="comment_text" form="postcomment" rows="4"
								cols="65"></textarea>
							<br> <input type="submit" value="Post Comment"
								name="submitComment" />
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
	<script>
		function addInterview() {
			var txt = document.getElementById("interviews").value;
			alert(txt);
			txt = txt + document.getElementById("interview").value;
			document.getElementByName("interviews").value = txt;
		}
		function addComment() {
			var txt = document.getElementById("comments").value;
			alert(txt);
			txt = txt + document.getElementById("comment").value;
			document.getElementByName("comments").value = txt;
		}
	</script>
</body>
</html>