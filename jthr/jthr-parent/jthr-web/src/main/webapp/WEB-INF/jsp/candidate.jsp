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
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAACtUlEQVRYR+2WbWiOURjHN5qXSKIhfGMLhW3I28oH5ZvXko8LQ01rWG15Le/FYiuSmFb7Ylb7okmEFOY9L00pyQeTTZOa2Gj4/dc5dTvu8zieHu3Lc9evc9/nPudc/3Od61znZGb085PZz/Yz0gLSHvgXDwwlYBfDEpgFuTDQBHEv5Ut4BFfgOnwNCfAQASMZqAI2waiQQWnTCafhKHxK1CeRgAF0XAeHIBt+wl1oNmUrZY8ZfAjlNCiElTDT1HdQ7oRz8CNOiE/ABBpfgAUg99YZIa8DPTCZdtuhCLRMt2A1vHf7xwlYRKMGGGtmWkyp2dpnEC/yzHqYZCpfUdaamX6PtJ3O+xmYC29B3nkYFeEKWGGMy4g6loJ1s/rJMxch352J+X5MuRTeRf4P5v2kEfyFchlcs/+jAlZReR6yYDcccIxone/BDI9xW/2El3mOcP3bA3tBu2M5XFWlFaAON0BGdsHBGCNbqTv2F+P29xZeamLaamL7oAsWwnMJGANPYRychQ0eIw+onx0oQJ7SpOIexYpi6A3kS0ATKDhegBJMt6fjZ+qHBQrQDEd42iqhKWFNhXoJ0B5dC761s+OkSoCWuQXyoFEChoPcOwUSLcF9/s8J9IAS1nxPW9nQFtYSFNggzOFDnZRqd8DhmM6bqTsRKKCEdqdi2irA98NvQWjbKSovG49sozzuDKD9LC+EbEMlnm9O/3K+q0Axpm2oQ+uPG5Gy4CVQoFRDJUQzWzKJSHnlCJSZsZRvdJ70PXGpWOusnTER7sBG8KVipVo9z8CXinUqKh7aYQ3ctMZ9AlSvnNAIOt1ScRjdNsbbosYTCdC/kOP4g/GijuuUHsdRobqQKICUvca7M/B8p+RC4o6tc11BqghWStaVbDToovIR/tuVLHDSyTULuRMmN3Jgr7SAtAd+AYSclI75gs1sAAAAAElFTkSuQmCC);
	width: 32px;
	height: 32px;
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
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABrElEQVRYR72Wu0oEMRSGXW30AWQ7sbMSLO2UtbXQUrTxgo8gwmIniL2teHsERbGwtLYQxEJREVTEUtAtvPxHJnCIJzMntxn4YZNM8n2TSbLT6Mp7dWP4GeQeOZdQjYz8Hoy9h8wiP8gismPzcglwuGF+FxK7XCKHgATnEgvFzPzV5RDow7hHSMvxemkm5pH91AL05JvIFvKKHGokUs0An/YHgMeVEmMpBKR3rpVYjhUoW3BVEseYpekYgTK4WX8uiROCI51QAQ3cJdEx8NBd4AOXJL7oyU2D7wyEwA1rGz+W7LPBRyAGfgrwFPIZKpAFrl0D2eAagazwKoHs8DKBWuAugdrgkkCtcElgHZVte68qys59XtWXH0RN3ExfK2fIcFVH1h4M5zNAIjfFafXiIREF5wKDKNwhbwh9y2kkouFcYBIF+oajSyORBM4FVlHYYO+VJCaQZ+F1JINzgQMU5qyFJ0kkhXOBCxRGhJXPJdbQvoL8+0sV+qmraPXT4fOO9Dp6PaJ+FHlSj+pxIwkMIdcInQG0FS+t3BZtHsPqbyWBfmQAuUI+9F3T3PkL2b6CyG1WKG0AAAAASUVORK5CYII=);
	width: 32px;
	height: 32px;
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
		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABoAAAAgCAYAAAAMq2gFAAADNklEQVRIS72WWahPURTG75UxM5mSKSQKyfhA7oMp8wNXSkJ4IEWGRGQIkcgcxQMpQzLEAx4MUeauMl7JFV1kuIZryvj7TmdrW+3TVv+y6uuctfZa+zt7n7XW3vl5/0ny/5GnPn4bQSPj/wR9OvgUm0dEvUDLiGN/xidl+KzDfjUS/0hEZaBO7ItyHC8T0QdQI8eJYuHlIhoC2sY8cxwvdsnQnIlqmck+or9ME6CaN3aX98qgtWd7z/sb0BRUMvPIXuqIdqBMMQ730NuDy6CHN6bEaAz2eLYTvA8Fb0FtM89K9IWOaDHKUuPwHL0JOAU0uZMQ0V4Gx4PvwJbMNGzbnFGpu9MQfUHXlh0AoyNEWxlfkK7ITJM3DMNxRzQA5aT1QK8KNoPJESJtj7a/JDBHF2xFjqgDyu2AkzrBXDAnQjQv/dCbgTkaYHvliJRx7wJO7bAVguURoqmM3wfnzBxf0bX9v/wfpxStaRx7oivjNkWIxjD+GRwz8Q/R28jmE91BVzr7on+n7fNTOZR1A1O/3SZeKyywRDaNNa5tU/b5Xxoi0soFdXhflPbjLNEuDBONo/ZehXves4eIQv9SIavBfEu0DMMiQxTKphCROoWyc7aJn4Gu8vjrH+nrtxvHFeiqj8eRFSmzlDB+vSlkJDhqiQZjUM/yZQuKKt5Pfbsi10EO4jfKxHdDv26JOmGwBRfqYZbI9cTTxPczRNrSF5aoHobXxtF1Zf8UtkSuy18htrsX/413tbCflkg1pUuGBp1c5KU3KAEtUqMl0jGie0cx8A9QxbRyE9mW/oCBpJJTucWzIygCnTOI1IwHAW1RQy/2Au99sojOMFDgOT/lvRk4C/pmEO3HPhYoKXTyOtmX2hPdrkitJqnkVMp5qv8pRYdnEKkkZgF7t1uLTbUVJFqFNalkT3QH0KGoE1Ri/9EabOvBMxM3E31DFpFunUkle6Jb6hKgKg8Rqc4OA11afFFNHcoiGsHAEROg284E4NqTXZHuBDfAJROnJquUT8T+o67YrpkAXZeqgOqpXTedCsBdz3QB1aWkronT1as0i0hnjyo9V/mRfpyewRXpS1V4FXNk0seqiP/Ib2ixrINP9B7SAAAAAElFTkSuQmCC);
	width: 26px;
	height: 32px;
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
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAACS0lEQVRYR9WXz0tVQRTH3wPFNibiJvoDighBIakW1SJEBG3Xc+emoIKsCKIoWlWiBmkugiJX7tSlaJnoK1AUd8LLtW2Cgn4sip4u6vOFuTDvMfe9O/cNiQNfZu7MOef7nTP3zuFmM3vcshb/ccZXwLGUmp7gl3f4NjP3FHw36+/odyK7SEArExugISX5A/wGHb5NzImww1orMO4D6jORgDHGNwOTK5yyOQ2UXbtt8dAOipGAKR4uphAQt/NGYtWDb+AAeAn6y+L38jwbJ+ARix+qCPrN+qrD5iBzb8ARcBdMmEw/pr9v2Q8zvhcnIGdS55uUiPy05fiK8XWwC16DS2ZNWbkaUkALARdBm0P1pDmCOvoVoOz1gF+hBLh2Xq7jsjkOHc0X8EMGIQRU2rktQvfAUfDVnqxVgL5zvXCnErws69h0gZ+hBCTdufiWzZnr7Eta2gwEIU/7Dijtb8HJtGk3fufo3/tmIMTOxTkKDoOcj4CQ5Ko7qhFeAkZwuFNj2ofw1/Ws5i1A2boBVNtVaFzN+akZw276OcspsYB5nPJAJbsIOsEM0O1nt0rkslO1VdWNWmIBf43HJv0FsA3OgAWgUqsW+51bhDULUKxPQLfeZ3ANvADVdh5pCCJAwUR4Fqi8qsbr5Sy5Xq1d28NgAhT0oSGP4XJOBxWwBMV5H3ZsUwvw5Ik1318CnrGPtVBbN3H09dy2Yla8BwJzO8OVCBjHZOB/sFoczxnfCvVr5qv9Dw4nQMH1c3rIN5qnvW5R/RN8lJ8twDNOGPN//K2vIY3a8dcAAAAASUVORK5CYII=);
	width: 32px;
	height: 32px;
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