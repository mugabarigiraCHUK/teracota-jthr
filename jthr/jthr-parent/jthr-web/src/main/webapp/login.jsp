<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="language"
	value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}"
	scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="edu.msg.jthr.web.i18n.login.login" />
<!DOCTYPE html>
<html lang="${language}">
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<style>
body {
	margin: 0;
	padding: 0;
	background: #EEE6E6;
	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body {
	position: absolute;
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
	top: calc(50% - 130px);
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

.login input[type=submit] {
	width: 260px;
	height: 35px;
	background: #8b2d4b;
	border: 1px solid #fff;
	cursor: pointer;
	border: 1px solid rgba(125, 125, 125, 0.6);
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

#logo {
	float: right;
	clear: both;
}

#name {
	clear: both;
}

#login-message {
	color: #8b2d4b;
	font-size: 15px;
	padding: 10px;
}
</style>
</head>
<body>
	<div>
		<form>
			<select id="language" name="language" onchange="submit()">
				<option value="en" ${language == 'en' ? 'selected' : ''}>English</option>
				<option value="de" ${language == 'de' ? 'selected' : ''}>Deutsch</option>
				<option value="ro" ${language == 'ro' ? 'selected' : ''}>RomÃ¢nÄƒ</option>
			</select>
		</form>
	</div>
	<!-- <div class="grad"></div> -->
	<div class="header">
		<div id="logo">
			<img src="/jthr-web/header/msg2.gif" />
		</div>
		<div id="name">
			JT<span> Human Resource</span>
		</div>
	</div>
	<br>
	<div class="login">
		<div id="login-message"
			<%Boolean ic = (Boolean) request.getSession().getAttribute(
					"invalid_credentials");
			if (ic == null) {
				out.print("style='display:none;'");
			} else {
				request.getSession().removeAttribute("invalid_credentials");
			}%>>Username
			or password incorrect!</div>
		<form action="login" method="POST">
			<input type="text" placeholder="<fmt:message key="login.label.username" />" name="username" autofocus><br>
			<input type="password" placeholder="<fmt:message key="login.label.password" />" name="password"><br>
			<input type="submit" value="<fmt:message key="login.button.submit" />">
		</form>
	</div>
</body>
</html>