<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
					<form action="register" method="POST">
						<input type="hidden" name="inter_id" value="${interid}" />
						<table border="0">
						
							<tr>
								<td><label>Interviewers</label><font color="red"></font></td>
								<td><input type="text" name="interviewers" value="${interviewers}" disabled></td>
							</tr>

							<tr>
								<td><label>Data</label><font color="red"></font></td>
								<td><input type="text" name="data" value="${data}" disabled></td>
							</tr>

							<tr>
								<td><label>Candidate</label></td>
								<td><input type="text" name="candidate" value="${candidate}" disabled></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>


