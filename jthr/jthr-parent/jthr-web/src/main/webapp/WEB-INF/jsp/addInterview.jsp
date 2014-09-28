<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="style.css" type="text/css">
<link rel="stylesheet" href="form/form.css" type="text/css">
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
					<div class="forma form">
						<form action="addinterview" method="POST">
							<table border="0">
								<tr>
									<td><label>Interviewer</label></td>
									<td><select name="interviewer" id="interviewCombobox">
											<c:forEach items="${interviewList}" var="interview">
												<option value="${interview.key}">${interview.value}</option>
											</c:forEach>
									</select></td>
									<td><div class="addGenBTN">
										<button type="button" title="Add" onclick="getFromCombo()">
											<img alt="add" src="resources/plus.png">
										</button>
										<button type="button" title="Remove Last" onclick="removeLastUser()">
											<img alt="remove" src="resources/minus.png">
										</button>
									</div></td>
								</tr>
								<tr>
									<td><label>       </label></td>
									<td><input type="text" id="interviewTextField" name="interSelected" readonly></td>
								</tr>
								<tr>
									<td><label>Date</label></td>
									<td><input type="date" id="dateTextField" name="date"></td>
								</tr>
								<tr>
									<td><label>Candidate</label></td>
									<td><input type="text" id="candidateTextField" value="${candidate}" name="candidate" readonly></td>
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
<script>

	var arr = [];

	function getFromCombo() {

		var e = document.getElementById("interviewCombobox");
		var strUser = e.options[e.selectedIndex].text;
		var txt = document.getElementById("interviewTextField").value;

		if (arr.length != 2)
			arr.push(strUser);
		else
			alert("You can add maximum of two employees to an interview !");
		document.getElementById("interviewTextField").value = arr;
	}

	function removeLastUser() {

		arr.pop();
		document.getElementById("interviewTextField").value = arr;

	}
</script>
</body>
</html>

