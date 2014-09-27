<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="position/positionTable.css" type="text/css" />
<link rel="stylesheet" href="style.css" type="text/css">
<link rel="stylesheet" href="menu/sidebar.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>

<style>
.view {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAB2klEQVRIS+WVTSilURzG3UJJDRYyyWgmWYlYMK58lGGlWPlaYKWUbLCymJKtsrGQspGPxHwkqzFN+ZaVFRsWEpIFsaPwe3ROnV733vHe3NU99ev83/Oe83/Oed5zzhtIiHEJxDh/QnwIaJUlUArpxtIb6j3Yh6dINkey6AsDe6EZcsMkOaJ9BibgMlSfUAIpdByCQTO7Zeo5ULIrkySTOh/aoRHuYRjG4cEV8gp84uUvKIJJGHFmVk381Qzepd4w8Ufq79ANam+FcyviChTS+Me8aHESpBEvQZ07M9NX9t2a9hrqBXiEb3Codiug5P/gGurhxEm2QtzgSW4fZV+T8+4z8SqkQhUcS0B+akckQjmcOQOCxNthkttm2abxtuQQyCqtLCiBn2YW8njLk2yA59H/CPTzfszTp5LnNZiVwBR0miVJ2S3RCmjl6/BDAvJrBzIgJhZpxnlmSXfUtXDhLMPPR85mnDbLB+PIy0e2RSJ/QW1tYO1S52lwd4vG/IYusNu0gngekuDVNrUi2lGLoM7eg6ZtJwtVZOmmid980KyIZtAHOp3JYK+KA+JT00knvgB8XxVWRHUW9EAHyL5QJarLzptI36QYyuBdr+swk/bXHB+/TH+eeHo/A8z3ZYH18GeMAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
}

.view:hover{
	opacity: 0.5;
}

.view:active{
	opacity: 0.3;
}

.edit {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABZklEQVRIS62Wu0oEMRhGXbARK29PINira+8KgmBh6QvoI/gYtlpZu3aCzbIK2gkiFooK6gOolSAWiqDnWyYSQxKSmQQOs3PZ78z/TzK7raEyY4yYLejCtR3ZKpCv8BOYgzdYhkuT21Sg8GOYt270n6SJYJjQKTiDGacTf5K6gnEC+7ADPTgNSBbrCBSuns/CD2xEJNu5AjvcdCUkueeCTo7AFx6SfHNiCV5SBbFwn0SCV51IEaSEG8ktH7QevlLXQU64eq62PNtTNlZB4/BYi3LDO3qgzmIb7PoqKBbuExQNdwU54XdmnvvaEnrIK5w4Ar3EYiM53K5gk50H0NtxPyLJCrcFe+yswypMgn6Z3EoUrtkyWKGpw8yiC76wAB+VZILtgSWpFW4qkOQdRqu7siWq5LHOnZsKFT4NT07JRjLC8avctthZEqzBYXXwk63eKTdwDrupvQ5dJ0G7qkJ/N9QOvWqLjV+kNVnr0KwlTAAAAABJRU5ErkJggg==);
	width: 24px;
	height: 24px;
	border: none;
}

.edit:hover{
	opacity: 0.5;
}

.edit:active{
	opacity: 0.3;
}

.clone {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABXUlEQVRIS91VO24CMRBdhKjhAkhESskdwjmgiRBF0uUCAZIrgBBI5BrUy02o6egTJe9ZY8k4nsGwW2Hpsazn82bGM95GURQL4BVoAtb6gHAuCn08d0DXMPiBbNXAz3fkfI/3MmHIPb//jv+foqPpjyB/IMFv5CyMVAuQmcxEqOk7HYuAxKZxVQJGEJYlzKaWDIzzc4d9PyXSumiALJ/q6CKrlEXVLqK9Pw/+Dxc7cGoRWF3kB+0LTh5ZCmnpkKDSoOVcFbwh3FWhTbI1aPFMvGGjkzqMW0sU+urJy+FaArM7coWpDHJtY724i5zcE2jDkkM2kC4yCXKuaI1Mm4OzDDZ4exEP3iB0mIxOFDgLY6nGvyBoyE8bsQWOgE85VGaGqcUhG4p9K6VAgjUwAS59k7USMbglwFlIZhBv+hKdIGiL0CqRRuz2U4YkeJZS8ckPS60EdFoCBwmNhMRN6w8zUW4sl/lYUQAAAABJRU5ErkJggg==);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

.clone:hover{
	opacity: 0.5;
}

.clone:active{
	opacity: 0.3;
}

.delete {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAAYCAYAAAAYl8YPAAACTUlEQVQ4T62VS0iVURSFVRpYGCnlxKIGUdBLbRA9zGgmaYI0SKVhEWVENCjTgVGgUhhElBrmSAslGvlqJhg9iAbaAyVKpHQghqFYEkH2LTkH9v05XW/ggcVZe+91193/Oec/f3JS/JFCeZWR/IT/+ddPkuN4qTYCthrNG/ieeGYTFLOW6DCR8rj+fQqsS0S9hGZKZmkgdRnM5mWmRf4IVjhDLfB2MAxU/wV2gE+uPsu8G3w2DXxXzm/AV4INprgGrrVU1zJLB/OuLm0+GDP6d/Bsb/aKYK8pboS/BOsDZu/JnQBDRv8UfsSbPSE4Zoq74J1Ajxvt7Dm5KjBg9K3wU97sDsF5UzwIvwkOBMx6yDWDLqO/Dr/qzS4T3DDFo/Bzaj1g9ohcH2gz+tPwFm+mNWg3RcXFoCxg1kTuA7hr9EXwXm92mKDfFCvg2eBMwKye3ByoNfpc+JA320Kgs+ZHNUTHozJgdoXcWnDJ6DPh37yZboYfpqj1mwF1AbOz5HRotU4a2u2VYMHeGtMkMpxAu/UWNAbMysmVgFKnHWXeLG7NdIp3OkEHs7b+YcCskNwFUOC0z5gPRc10ir1AW38PdAfM8sjdAvvMH6vbmM4eEJ90ghfMWnz9a/QNUPePwTanbWBe3Az7mNeIa5xA50hnTI8eNdOF8Br4C/Ui/HbUTLtz35npxtgPvgTMVpObBP7bcNx1GtOZFlbvnYY+HFo/PeZvoCtHN8sC0DdA3wI/9P7qhokxyyEeNKJE6Sb3BDFmOtVaq/8Z6lR3n7pP+guXqYbxgVDCfwAAAABJRU5ErkJggg==);
	width: 19px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

.delete:hover{
	opacity: 0.5;
}

.delete:active{
	opacity: 0.3;
}

.addCandidate {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABGElEQVRIS2NkoDFgpLH5DCPTAm1gsHYBsSMQ/wfifUBcBsTXsQU3qUEEMvw4EPOiGfYJyLfAZgmpFmwFGuKFI2FsBor7octhswDkbRDAJvcNKM6Jw4KvQHEeSi0AGcJFSwtAweCDw4KNQPEAXD6ABQuufAcLLk2gghNAzIem8AM0km9SagFIP8iSTiB2ghq2B0iXAzGG4bgiEl8k4/IhTnFSUxFNLZAFmh4LxC5ArAXEwlDb3gDpa0AMCqrFQPwE2RXEZDQOoIY2IM4BYlYCXvgFlJ8ExDVA/BNXHCCbAUotO4EYVAyQAo4BFXsA8WdCPtgAVORPislIatcB2cGELCCUPwjZzTjgFhByIUF5Qj4gaAAhBUPfAgAlpS0ZnHrj5QAAAABJRU5ErkJggg==);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

.addCandidate:hover{
	opacity: 0.5;
}

.addCandidate:active{
	opacity: 0.3;
}

tr:hover {
    background-color: #8b2d4b;   
}

</style>

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
							<td>Position Name</td>
							<td>Places A/C/T</td>
							<td>Department</td>
							<td>Project</td>
							<td>Requirements</td>
							<td>Responsibilities</td>
							<td>Approved</td>
							<td>Closed</td>
							<td>Created by</td>
							<td>Operations</td>
						</tr>
						<c:forEach items="${poz}" var="position">
							<tr>
								<td><c:out value="${position.name}"></c:out></td>
								<td><c:out value="${position.nrOfPlaces}" />/<c:out value="${fn:length(position.candidates)}" /></td>
								<td><c:out value="${position.department.departName}" /></td>
								<td><c:out value="${position.project.projectName}" /></td>
								<td><c:out value="${position.requirements}" /></td>
								<td><c:out value="${position.responsibilities}" /></td>
								<td><c:out value="${position.isApproved}" /></td>
								<td><c:out value="${position.isClosed}" /></td>
								<td><c:out value="${position.creator.firstName}" /> <c:out value="${position.creator.lastName}" /></td>
								<td>
									<div style="text-align:center;">
									<form action="position" method="POST">
										<input type="hidden" name="position_id" value="<c:out value="${position.id}" />"/>
										<input type="submit" name="viewPosition" value="" class="view" title="View" />
										
										<c:if test="${position.isClosed == false and position.isApproved == true}">
	 										<input type="submit" name="editPosition" value="" class="edit" title="Edit" />
	 										<input type="submit" name="addCandidate" value="" class="addCandidate" title="Add Candidate" />
	 									</c:if>
	 									<c:if test="${position.isClosed == true}">
											<input type="submit" name="clonePosition" value="" class="clone" title="Reuse" />
										</c:if>
										
										<!-- <input type="submit" name="deletePosition" value="" class="delete" title="Delete" onclick="return confirm('Are you sure you want to delete?')"/> -->
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