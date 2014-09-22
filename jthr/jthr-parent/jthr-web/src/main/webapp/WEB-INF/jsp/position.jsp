<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAACtUlEQVRYR+2WbWiOURjHN5qXSKIhfGMLhW3I28oH5ZvXko8LQ01rWG15Le/FYiuSmFb7Ylb7okmEFOY9L00pyQeTTZOa2Gj4/dc5dTvu8zieHu3Lc9evc9/nPudc/3Od61znZGb085PZz/Yz0gLSHvgXDwwlYBfDEpgFuTDQBHEv5Ut4BFfgOnwNCfAQASMZqAI2waiQQWnTCafhKHxK1CeRgAF0XAeHIBt+wl1oNmUrZY8ZfAjlNCiElTDT1HdQ7oRz8CNOiE/ABBpfgAUg99YZIa8DPTCZdtuhCLRMt2A1vHf7xwlYRKMGGGtmWkyp2dpnEC/yzHqYZCpfUdaamX6PtJ3O+xmYC29B3nkYFeEKWGGMy4g6loJ1s/rJMxch352J+X5MuRTeRf4P5v2kEfyFchlcs/+jAlZReR6yYDcccIxone/BDI9xW/2El3mOcP3bA3tBu2M5XFWlFaAON0BGdsHBGCNbqTv2F+P29xZeamLaamL7oAsWwnMJGANPYRychQ0eIw+onx0oQJ7SpOIexYpi6A3kS0ATKDhegBJMt6fjZ+qHBQrQDEd42iqhKWFNhXoJ0B5dC761s+OkSoCWuQXyoFEChoPcOwUSLcF9/s8J9IAS1nxPW9nQFtYSFNggzOFDnZRqd8DhmM6bqTsRKKCEdqdi2irA98NvQWjbKSovG49sozzuDKD9LC+EbEMlnm9O/3K+q0Axpm2oQ+uPG5Gy4CVQoFRDJUQzWzKJSHnlCJSZsZRvdJ70PXGpWOusnTER7sBG8KVipVo9z8CXinUqKh7aYQ3ctMZ9AlSvnNAIOt1ScRjdNsbbosYTCdC/kOP4g/GijuuUHsdRobqQKICUvca7M/B8p+RC4o6tc11BqghWStaVbDToovIR/tuVLHDSyTULuRMmN3Jgr7SAtAd+AYSclI75gs1sAAAAAElFTkSuQmCC);
	width: 32px;
	height: 32px;
	border: none;
}

.view:hover{
	opacity: 0.5;
}

.view:active{
	opacity: 0.3;
}

.edit {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABrElEQVRYR72Wu0oEMRSGXW30AWQ7sbMSLO2UtbXQUrTxgo8gwmIniL2teHsERbGwtLYQxEJREVTEUtAtvPxHJnCIJzMntxn4YZNM8n2TSbLT6Mp7dWP4GeQeOZdQjYz8Hoy9h8wiP8gismPzcglwuGF+FxK7XCKHgATnEgvFzPzV5RDow7hHSMvxemkm5pH91AL05JvIFvKKHGokUs0An/YHgMeVEmMpBKR3rpVYjhUoW3BVEseYpekYgTK4WX8uiROCI51QAQ3cJdEx8NBd4AOXJL7oyU2D7wyEwA1rGz+W7LPBRyAGfgrwFPIZKpAFrl0D2eAagazwKoHs8DKBWuAugdrgkkCtcElgHZVte68qys59XtWXH0RN3ExfK2fIcFVH1h4M5zNAIjfFafXiIREF5wKDKNwhbwh9y2kkouFcYBIF+oajSyORBM4FVlHYYO+VJCaQZ+F1JINzgQMU5qyFJ0kkhXOBCxRGhJXPJdbQvoL8+0sV+qmraPXT4fOO9Dp6PaJ+FHlSj+pxIwkMIdcInQG0FS+t3BZtHsPqbyWBfmQAuUI+9F3T3PkL2b6CyG1WKG0AAAAASUVORK5CYII=);
	width: 32px;
	height: 32px;
	border: none;
}

.edit:hover{
	opacity: 0.5;
}

.edit:active{
	opacity: 0.3;
}

.clone {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABZklEQVRYR+1Xy23CQBC1SyCB5EYTSSGcOdEAElEKwGkgkAJypxegET6WUkHyxtqR7JW9M7OxMUhYGiGxb96++ex4nSZJMoWtYSOY5Uk9MPGsYE9KkgNwb0RyhA2VTmWYLyDH4sDIkxPJb4OTv4HE7fOE/F9AtiPCvgTQ3oVgjQCOTMqIJQO3JUCqPa93loHeBdx7ILYEKj/NMVQRBQZa0F8jwNoDPC8kv84G0StC3pcyUjfACLPVTkJtCc4APmjBDtfqyyjmdbxoswf84KUeKPBdCsicIv6trY5GgLGsNvhVC7CF0owO3iNCGbi4AOnGYxVkPgW9C3hEiHS15uc/t2X6xqB7Px/1xuyVe+AbqHfYj0PHChjD/ws20QqImeHafqAsPIfAlIEZ7BNm/aqRRJwAmMM2koCm9dgSSMIq66HOZwEfzmOpqalpd4AlAbR55kjpl0S0elxDZLQhb86B1f1nDbqC/wMQHVui0whUHAAAAABJRU5ErkJggg==);
	width: 32px;
	height: 32px;
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
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABoAAAAgCAYAAAAMq2gFAAADNklEQVRIS72WWahPURTG75UxM5mSKSQKyfhA7oMp8wNXSkJ4IEWGRGQIkcgcxQMpQzLEAx4MUeauMl7JFV1kuIZryvj7TmdrW+3TVv+y6uuctfZa+zt7n7XW3vl5/0ny/5GnPn4bQSPj/wR9OvgUm0dEvUDLiGN/xidl+KzDfjUS/0hEZaBO7ItyHC8T0QdQI8eJYuHlIhoC2sY8cxwvdsnQnIlqmck+or9ME6CaN3aX98qgtWd7z/sb0BRUMvPIXuqIdqBMMQ730NuDy6CHN6bEaAz2eLYTvA8Fb0FtM89K9IWOaDHKUuPwHL0JOAU0uZMQ0V4Gx4PvwJbMNGzbnFGpu9MQfUHXlh0AoyNEWxlfkK7ITJM3DMNxRzQA5aT1QK8KNoPJESJtj7a/JDBHF2xFjqgDyu2AkzrBXDAnQjQv/dCbgTkaYHvliJRx7wJO7bAVguURoqmM3wfnzBxf0bX9v/wfpxStaRx7oivjNkWIxjD+GRwz8Q/R28jmE91BVzr7on+n7fNTOZR1A1O/3SZeKyywRDaNNa5tU/b5Xxoi0soFdXhflPbjLNEuDBONo/ZehXves4eIQv9SIavBfEu0DMMiQxTKphCROoWyc7aJn4Gu8vjrH+nrtxvHFeiqj8eRFSmzlDB+vSlkJDhqiQZjUM/yZQuKKt5Pfbsi10EO4jfKxHdDv26JOmGwBRfqYZbI9cTTxPczRNrSF5aoHobXxtF1Zf8UtkSuy18htrsX/413tbCflkg1pUuGBp1c5KU3KAEtUqMl0jGie0cx8A9QxbRyE9mW/oCBpJJTucWzIygCnTOI1IwHAW1RQy/2Au99sojOMFDgOT/lvRk4C/pmEO3HPhYoKXTyOtmX2hPdrkitJqnkVMp5qv8pRYdnEKkkZgF7t1uLTbUVJFqFNalkT3QH0KGoE1Ri/9EabOvBMxM3E31DFpFunUkle6Jb6hKgKg8Rqc4OA11afFFNHcoiGsHAEROg284E4NqTXZHuBDfAJROnJquUT8T+o67YrpkAXZeqgOqpXTedCsBdz3QB1aWkronT1as0i0hnjyo9V/mRfpyewRXpS1V4FXNk0seqiP/Ib2ixrINP9B7SAAAAAElFTkSuQmCC);
	width: 26px;
	height: 32px;
	border: none;
	margin-left: 5px;
}

.delete:hover{
	opacity: 0.5;
}

.delete:active{
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
							<td>Nr of places</td>
							<td>Department</td>
							<td>Project</td>
							<td>Requirements</td>
							<td>Responsibilities</td>
							<td>Operations</td>
						</tr>
						<c:forEach items="${poz}" var="position">
							<tr>
								<td><c:out value="${position.name}"></c:out></td>
								<td><c:out value="${position.nrOfPlaces}" /></td>
								<td><c:out value="${position.department}" /></td>
								<td><c:out value="${position.project}"></c:out></td>
								<td><c:out value="${position.requirements}"></c:out></td>
								<td><c:out value="${position.responsibilities}"></c:out></td>
								<td>
									<div style="text-align:center;">
									<form action="position" method="POST">
										<input type="hidden" name="position_id" value="<c:out value="${position.id}" />"/>
										<input type="submit" name="viewPosition" value="" class="view" title="View" />
	 									<input type="submit" name="editPosition" value="" class="edit" title="Edit" />
										<input type="submit" name="clonePosition" value="" class="clone" title="Reuse" />
										<input type="submit" name="deletePosition" value="" class="delete" title="Delete" onclick="return confirm('Are you sure you want to delete?')"/>
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