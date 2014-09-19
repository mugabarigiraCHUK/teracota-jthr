<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<header>
		<div id="logo">
			<div id="logo_text">
				<!-- class="logo_colour", allows you to change the colour of the text -->
				<h1>
					<a><span class="logo_colour">JT Human Resources</span></a>
				</h1>
			</div>
		</div>
		</header>

		<%@ include file="menu.jsp"%>

		<div id="site_content">
			<div id="table_container">
				<div class="CSSTable">
					<form action="addCandidate">
						Position Name: <input type="text" size="30" /> <br>
						
						<input type="submit" value="Add Candidate" />
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>