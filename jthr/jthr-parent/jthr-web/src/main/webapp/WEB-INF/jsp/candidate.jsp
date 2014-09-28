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
.view {
	background:
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAB2klEQVRIS+WVTSilURzG3UJJDRYyyWgmWYlYMK58lGGlWPlaYKWUbLCymJKtsrGQspGPxHwkqzFN+ZaVFRsWEpIFsaPwe3ROnV733vHe3NU99ev83/Oe83/Oed5zzhtIiHEJxDh/QnwIaJUlUArpxtIb6j3Yh6dINkey6AsDe6EZcsMkOaJ9BibgMlSfUAIpdByCQTO7Zeo5ULIrkySTOh/aoRHuYRjG4cEV8gp84uUvKIJJGHFmVk381Qzepd4w8Ufq79ANam+FcyviChTS+Me8aHESpBEvQZ07M9NX9t2a9hrqBXiEb3Codiug5P/gGurhxEm2QtzgSW4fZV+T8+4z8SqkQhUcS0B+akckQjmcOQOCxNthkttm2abxtuQQyCqtLCiBn2YW8njLk2yA59H/CPTzfszTp5LnNZiVwBR0miVJ2S3RCmjl6/BDAvJrBzIgJhZpxnlmSXfUtXDhLMPPR85mnDbLB+PIy0e2RSJ/QW1tYO1S52lwd4vG/IYusNu0gngekuDVNrUi2lGLoM7eg6ZtJwtVZOmmid980KyIZtAHOp3JYK+KA+JT00knvgB8XxVWRHUW9EAHyL5QJarLzptI36QYyuBdr+swk/bXHB+/TH+eeHo/A8z3ZYH18GeMAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
}

.view:hover {
	opacity: 0.5;
}

.view:active {
	opacity: 0.3;
}

.edit {
	background:
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABZklEQVRIS62Wu0oEMRhGXbARK29PINira+8KgmBh6QvoI/gYtlpZu3aCzbIK2gkiFooK6gOolSAWiqDnWyYSQxKSmQQOs3PZ78z/TzK7raEyY4yYLejCtR3ZKpCv8BOYgzdYhkuT21Sg8GOYt270n6SJYJjQKTiDGacTf5K6gnEC+7ADPTgNSBbrCBSuns/CD2xEJNu5AjvcdCUkueeCTo7AFx6SfHNiCV5SBbFwn0SCV51IEaSEG8ktH7QevlLXQU64eq62PNtTNlZB4/BYi3LDO3qgzmIb7PoqKBbuExQNdwU54XdmnvvaEnrIK5w4Ar3EYiM53K5gk50H0NtxPyLJCrcFe+yswypMgn6Z3EoUrtkyWKGpw8yiC76wAB+VZILtgSWpFW4qkOQdRqu7siWq5LHOnZsKFT4NT07JRjLC8avctthZEqzBYXXwk63eKTdwDrupvQ5dJ0G7qkJ/N9QOvWqLjV+kNVnr0KwlTAAAAABJRU5ErkJggg==);
	width: 24px;
	height: 24px;
	border: none;
}

.edit:hover {
	opacity: 0.5;
}

.edit:active {
	opacity: 0.3;
}

.delete {
	background:
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAAYCAYAAAAYl8YPAAACTUlEQVQ4T62VS0iVURSFVRpYGCnlxKIGUdBLbRA9zGgmaYI0SKVhEWVENCjTgVGgUhhElBrmSAslGvlqJhg9iAbaAyVKpHQghqFYEkH2LTkH9v05XW/ggcVZe+91193/Oec/f3JS/JFCeZWR/IT/+ddPkuN4qTYCthrNG/ieeGYTFLOW6DCR8rj+fQqsS0S9hGZKZmkgdRnM5mWmRf4IVjhDLfB2MAxU/wV2gE+uPsu8G3w2DXxXzm/AV4INprgGrrVU1zJLB/OuLm0+GDP6d/Bsb/aKYK8pboS/BOsDZu/JnQBDRv8UfsSbPSE4Zoq74J1Ajxvt7Dm5KjBg9K3wU97sDsF5UzwIvwkOBMx6yDWDLqO/Dr/qzS4T3DDFo/Bzaj1g9ohcH2gz+tPwFm+mNWg3RcXFoCxg1kTuA7hr9EXwXm92mKDfFCvg2eBMwKye3ByoNfpc+JA320Kgs+ZHNUTHozJgdoXcWnDJ6DPh37yZboYfpqj1mwF1AbOz5HRotU4a2u2VYMHeGtMkMpxAu/UWNAbMysmVgFKnHWXeLG7NdIp3OkEHs7b+YcCskNwFUOC0z5gPRc10ir1AW38PdAfM8sjdAvvMH6vbmM4eEJ90ghfMWnz9a/QNUPePwTanbWBe3Az7mNeIa5xA50hnTI8eNdOF8Br4C/Ui/HbUTLtz35npxtgPvgTMVpObBP7bcNx1GtOZFlbvnYY+HFo/PeZvoCtHN8sC0DdA3wI/9P7qhokxyyEeNKJE6Sb3BDFmOtVaq/8Z6lR3n7pP+guXqYbxgVDCfwAAAABJRU5ErkJggg==);
	width: 19px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

.delete:hover {
	opacity: 0.5;
}

.delete:active {
	opacity: 0.3;
}

.interview {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABbklEQVRIS8WVuy5FQRSG7QeQaBScuL2AmpxGS0jEQ6gPhYIT4pZIJIiOyiuIEBEKDbVKoXNpVDwB35/sJWPsPWZfxCR/Zs3MWv+/ZvZeM0nHH7ck5Z+k3wdDkXrb+C14vm3G8+AebIETrZvAI3ZfBfIBYm9Bj8MxjX1sAh8VyKeIvQCdadYjKdc1/ViWgM3FaG7itJgeywy9TuISjIJ30FVFwMgtkTeMJngFd+AILJUV8MlN5AFjGHSDJ02WEcgjN5FxjHMbFBXYJbAV+DhzrO2560UENnSmAXLVgXb3rcUK7BCl7PKaCky7c5t20ooRKENuMclvAoNkcQPcCnWzXGaw7mWuurCjCgpM4HgF/Ao1vhWMtYwzc2+FoIAcdXH5FSrOPHKtFRJQgF+hh8ytBj54YQFx/ajQugXEpzfjNEBsS9E7iODKdPl/gbKZZ8V9/abPrDbqZIZL13W/++gfMNFbk8gLPLPgrMjzWEr7Eyl8WRkuEPMWAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

.interview:hover {
	opacity: 0.5;
}

.delete:active {
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
							<td>CV</td>
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
								<td><c:out value="${candidate.CV}"></c:out></td>
								

								<td>
									<div style="text-align: center;">
										<form action="candidate" method="POST">
											<input type="hidden" name="candidate_id" value="<c:out value="${candidate.id}" />" /> 
											<input type="submit" name="viewCandidate" value="" class="view" title="View" /> 
											<input type="submit" name="editCandidate" value="" class="edit" title="Edit" /> 
											<input type="submit" name="deleteCandidate" value="" class="delete" title="Delete" onclick="return confirm('Are you sure you want to delete?')" />
											<input type="submit" name="addInterview" value="" class="interview" title="Create Interview"/>
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