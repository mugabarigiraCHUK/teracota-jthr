<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<style>
body {
	margin: 0;
	padding: 0;
	background: #fff;
	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body {
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-color: #EEE6E6;
	background-size: cover;
	-webkit-filter: blur(5px);
	z-index: 0;
}

.grad {
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, rgba(0, 0
		, 0, 0)), color-stop(100%, rgba(0, 0, 0, 0.65)));
	/* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header {
	position: absolute;
	top: calc(50% - 35px);
	left: calc(50% - 375px);
	z-index: 2;
}

.header div {
	float: left;
	color: #8b2d4b;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
}

.header div span {
	color: #8b2d4b !important;
}

.login {
	position: absolute;
	top: calc(50% - 75px);
	left: calc(50% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.login input[type=text] {
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(125, 125, 125, 0.6);
	border-radius: 2px;
	color: #000;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=password] {
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(125, 125, 125, 0.6);
	border-radius: 2px;
	color: #000;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.login input[type=submit]{
	width: 260px;
	height: 35px;
	background: #8b2d4b;
	border: 1px solid #fff;
	cursor: pointer;
	border: 1px solid rgba(125,125,125,0.6);
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.login input[type=submit]:hover {
	opacity: 0.8;
}

.login input[type=submit]:active {
	opacity: 0.6;
}

.login input[type=text]:focus {
	outline: none;
	border: 1px solid rgba(125, 125, 125, 0.9);
}

.login input[type=password]:focus {
	outline: none;
	border: 1px solid rgba(125, 125, 125, 0.9);
}

.login input[type=submit]:focus {
	outline: none;
}

::-webkit-input-placeholder {
	color: rgba(125, 125, 125, 0.6);
}

::-moz-input-placeholder {
	color: rgba(255, 255, 255, 0.6);
}
</style>
<script src="js/prefixfree.min.js"></script>
</head>

<body>

	<div class="body"></div>
	<!-- <div class="grad"></div> -->
	<div class="header">
		<div>
			JT<span> Human Resource</span>
		</div>
	</div>
	<br>
	<div class="login">
		<form action="login" method="POST">
			<input type="text" placeholder="username" name="username"><br>
			<input type="password" placeholder="password" name="password"><br>
			<input type="submit" value="Login">
		</form>
	</div>

	<script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>
</body>
</html>