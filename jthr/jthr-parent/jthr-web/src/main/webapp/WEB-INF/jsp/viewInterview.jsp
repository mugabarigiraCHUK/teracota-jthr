<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css" />
<link rel="stylesheet" href="position/tablePositionCandidate.css" type="text/css" />
<link rel="stylesheet" href="style.css" type="text/css">
<link rel="stylesheet" href="form/form.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>

<style>
.forma {
	width: 50%;
	margin: 0 auto;
}

#comment-container {
	margin-top: 250px;
	min-width: 520px;
	border: 1px solid;	
}

#candidateForm .accept{
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAACCklEQVRIS72WvUudMRTGvXVQW9wUKbZgQcHRWe3QVqyIIuLioODiIoqgTv0DnDq0dCiUDi2CgyCtDn7Qf6GDgwh+i6hX1MWPwcGP/p5LUkL6vjeppb7wkNyck+c5SU5ObqYg//cYcyfoAE9BuXE/pt0FM+AbOEyjyaQYqhkfB13gQSCIG+zT4A3Y8H2TBET6FTwKEPvmCwZ6wXfX4AuMYHwL0lYW0tRqRsE76+gSdTM4+Q/klvOWjrimNGAFntBfAaWhECPtZ/jVgqwVmOBHT+TkWDedY58EqsAmCGVLPuJtjKugxXG6pv9MAsPuocSG5/gpuBfgAHzxdmJIAgvg9R2INUV5L/I9M7+ddtbhmpfAOtDF+ttvmQmvwJGZqL7IHzpEqxLQiSdlj8qAUu0zKPHUFZQi3zfjDbTzCTxnEtAN9G/tImNt4Aro4HQ7iwzZGu3LCHK5n0tAE2q8CBVZI9gx4xJTvVG2iFwHqk8+cwmRW7rcFqUdsrLjOcga73raLWArZ4hc03KHPAg+eCuwP5UlEvHLcdKBJlEMxFy0n8xsAqeR22KFfl80DXwC/Smr0PCSEamj9VMxbdpHDLkV6Ispdtr/ChDzTvxR7CTSDJQRhXlWEmNSareCH3K+1wfHRvdfn0wrUkZnDKjSFgf25RL7e6Cn9sT3Db297t8WFcRKQ6CbrnoU/NvyC9yCaiewVZ3IAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

#candidateForm .remove{
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAB6ElEQVRIS7VVSytFURS+NyUD8kiEUhQDj5mBjDziFgpDA7nG/Bv+gNeAAVOPPIdcEySvKRJiopSU77vtddv2Xeecfciur3v32mt/395r7bVOMvHPI+nwF2M+AawBjzG1K+E/DCwDn7LXFiiBcQvoBG6BbuDOU6QOfntAE7ABjAEf3CsCPPkm0GUR3hiR+wgRm1xcyTVKERGYxmROITqDrQ94ChCpgn0XaFXW07DNi0ANJgfmiq7vqRF5dhbCyM/N7V/sHHDDDtCmnOYKth7gwaxpYZFtx/gzALzR4L6iMJFLI1KAX0moe5Yf5JoAbbWGoFm5CXNBgQplTc2XewPZF3YThTuRd3JxChLguq/IEXxTEnNXPUxAwnWBP6XasWFjtbcDQc84L8kuD/PB5LLKtUFi1sCvBBqwcR+oDyAXM59wL6BWfFCIfMkjRTSBsCL68zNtxJFYRFpYDmEfBAoBdt0OJXTXsLHic+Gyb+BD/m5Iy31FRICvhQllP3fHCQz9wKuzUI05O2mLsodVzZvkmt0MJrOKYwY2Ni6XXFwpwgaptetJ2BfkBozrKjBiibB9DwESFkU/ayoDtgE7J0uYp4EvOwcUWQH4JfIlF1FbZBHGKZJz0X2mRbCNA+tAtp/HGJEf/Rhc/q7fUY9mGfHZ6R8AAAAASUVORK5CYII=);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

#candidateForm .view{
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAB2klEQVRIS+WVTSilURzG3UJJDRYyyWgmWYlYMK58lGGlWPlaYKWUbLCymJKtsrGQspGPxHwkqzFN+ZaVFRsWEpIFsaPwe3ROnV733vHe3NU99ev83/Oe83/Oed5zzhtIiHEJxDh/QnwIaJUlUArpxtIb6j3Yh6dINkey6AsDe6EZcsMkOaJ9BibgMlSfUAIpdByCQTO7Zeo5ULIrkySTOh/aoRHuYRjG4cEV8gp84uUvKIJJGHFmVk381Qzepd4w8Ufq79ANam+FcyviChTS+Me8aHESpBEvQZ07M9NX9t2a9hrqBXiEb3Codiug5P/gGurhxEm2QtzgSW4fZV+T8+4z8SqkQhUcS0B+akckQjmcOQOCxNthkttm2abxtuQQyCqtLCiBn2YW8njLk2yA59H/CPTzfszTp5LnNZiVwBR0miVJ2S3RCmjl6/BDAvJrBzIgJhZpxnlmSXfUtXDhLMPPR85mnDbLB+PIy0e2RSJ/QW1tYO1S52lwd4vG/IYusNu0gngekuDVNrUi2lGLoM7eg6ZtJwtVZOmmid980KyIZtAHOp3JYK+KA+JT00knvgB8XxVWRHUW9EAHyL5QJarLzptI36QYyuBdr+swk/bXHB+/TH+eeHo/A8z3ZYH18GeMAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

candidateTable {

}

.comment {
	margin-top: 10px;
    margin-left: auto;
	margin-right: auto;
	max-width: 500px;
	border: 3px solid #b5b5b5;
	background-color: #b5b5b5;
	padding-bottom: 5px;
}

.comment-username{
	padding: 10px;
	float: left;
	background-color: #b5b5b5;
}

.comment-buttons {
	padding: 10px;
	float: right;
	background-color: #b5b5b5;
}

.comment-text {
	padding: 10px;
	clear: both;
	min-height: 50px;
	background-color: white;
	margin-right: 5px;
	margin-left: 5px;
}

<!-- .submit-comment-button:hover {
	opacity: 0.7;
} -->

.delete {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA0AAAAQCAYAAADNo/U5AAABXklEQVQoU23STShEURjGcbPwsRiKUiwopWwkCguyQTaifC3YICUfJSVKWShRY2UUWQ4hydeCkpISxYqNlIWyIMnKSGzwf+qceme49et933PPc2fu6QYS/l6JLLUhCZ/YxLfdFmCIIGgW0+mrzXxEHzVzVKGtuNA/Px6z9KZQMfrc8iq1EWlYwCBecIZmtyesUAXO3cIYtRf5aMIurnCIcbenSKFcPLiFGWodSk3ohP4WA25PhkI6rS+oX0QBakxoj/4DHa4GtVHXE7KxhhS0mFCEPhP1uNNDfeiSoRwHeEaPCc3Rl6ESx6j1oW0GnY4O5AIjJjRJ34pCLKPLh8IMQ7jBBqZMaNg9JIc6jQkfGmWYxSNCmDehbjenUvux5EPtDOt4h452xYT01/TV6GrAvg9VMZy6G3q3HRPys26X4NqH8hjuXUgv24n4qts6+lcfSmbQUfvZ5WOKPoAs/PwCO89NwuUnX60AAAAASUVORK5CYII=);
	width: 13px;
	height: 16px;
	border: none;
	margin-left: 5px;
}

.delete:hover{
	opacity: 0.5;
}

.delete:active{
	opacity: 0.3;
}

.edit {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA/klEQVQ4T2NkIA3oAJVXAXEREL8AaWUkQb82UO1+IBYF4utA7AjEL4k1QBWoWByINwOxANTSayBDiDFAF6hwLxCfA+IWNEOWETIA5Od9UGeDLN6JZMhfINsZnwHommHBBTPkM1DgIi4DcGkGGfIOiK2B+AauWEAObfRIAml2AeLzMAl0F5CkGd0FIM2gABNDtxbqbGcgfQFdDuYCRaDECRya30KdjaEZ2QV+QE4CEAei2YBXM8wAWSDjLhDHAHEEkiEgzSBnX8TiJbgQyAueQLwNiH8jGWJHjGaYC0qBjC6okSBDQoH4KhDfwWczTA7kglgglgLiy1D8mBiNMDUAwLIz+5GDo0MAAAAASUVORK5CYII=);
	width: 16px;
	height: 16px;
	border: none;
}

.edit:hover{
	opacity: 0.5;
}

.edit:active{
	opacity: 0.3;
}

#candidateForm .interview {
	background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABbklEQVRIS8WVuy5FQRSG7QeQaBScuL2AmpxGS0jEQ6gPhYIT4pZIJIiOyiuIEBEKDbVKoXNpVDwB35/sJWPsPWZfxCR/Zs3MWv+/ZvZeM0nHH7ck5Z+k3wdDkXrb+C14vm3G8+AebIETrZvAI3ZfBfIBYm9Bj8MxjX1sAh8VyKeIvQCdadYjKdc1/ViWgM3FaG7itJgeywy9TuISjIJ30FVFwMgtkTeMJngFd+AILJUV8MlN5AFjGHSDJ02WEcgjN5FxjHMbFBXYJbAV+DhzrO2560UENnSmAXLVgXb3rcUK7BCl7PKaCky7c5t20ooRKENuMclvAoNkcQPcCnWzXGaw7mWuurCjCgpM4HgF/Ao1vhWMtYwzc2+FoIAcdXH5FSrOPHKtFRJQgF+hh8ytBj54YQFx/ajQugXEpzfjNEBsS9E7iODKdPl/gbKZZ8V9/abPrDbqZIZL13W/++gfMNFbk8gLPLPgrMjzWEr7Eyl8WRkuEPMWAAAAAElFTkSuQmCC);
	width: 24px;
	height: 24px;
	border: none;
	margin-left: 5px;
}

#candidateForm .interview:hover {
	opacity: 0.5;
}

#candidateForm .interview:active{
	opacity: 0.3;
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
						<table border="0">
						
<!-- 							<tr> -->
<!-- 								<td><label>Interviewers</label><font color="red"></font></td> -->
<%-- 								<td><input type="text" name="interviewers" value="${interviewers}" disabled></td> --%>
<!-- 							</tr> -->

							<tr>
								<td><label>Data</label><font color="red"></font></td>
								<td><input type="text" name="data" value="${data}" disabled></td>
							</tr>

							<tr>
								<td><label>Candidate</label></td>
								<td><input type="text" name="candidate" value="${candidate}" disabled></td>
							</tr>
							
							<tr>
								<td><label>Candidates</label></td>
								<td>
									<div id="candidateTable" class="datagrid">
										<table>
											<tr>
												<td>Interviewer Name</td>
												<td>Email</td>
												<td>Operations</td>
											</tr>
											
											<c:forEach items="${interviewers}" var="int">
												<tr>
													<td>${int.firstName} ${int.lastName}</td>
													<td>${int.email}</td>
													<td>
														<div id="candidateForm">											
															<form action="viewuser" method="POST">
																<input type="hidden" name="user_id" value="${int.id}" />
																<input type="submit" value="" name="viewCandidate" title="View" class="view" />
															</form>
														</div>				
													</td>
												</tr>
											</c:forEach>
										</table>
									</div>
								</td>
							</tr>
						</table>
				</div>
				
				<div id="comments-container">
					<c:forEach items="${comments}" var="comm">
						<div class="comment">
							<div class="comment-username">Posted by: ${comm.user.firstName} ${comm.user.lastName}</div>
							<form action="viewinterview" method="POST" id="comment__${comm.id}">
								<c:if test="${comm.user.id == user_id}"> <!-- userId should be obtained from session -->
									<div class="comment-buttons">
											<input type="hidden" name="cand_id" value="<c:out value="${cand_id}" />"/>
											<input type="hidden" name="comment_id" value="<c:out value="${comm.id}" />"/>
											<input type="hidden" name="inter_id" value="<c:out value="${inter_id}" />" />
											<input type="button" value="" class="edit" onclick="toggle_visibility('comment_${comm.id}')"/>
<!-- 											<input type="submit" value="" name="deleteComment" title="Delete" class="delete"/> -->
										
									</div>
								</c:if>
								<div class="comment-text">
									<textarea id="comment_${comm.id}_text" name="comment_text" form="comment__${comm.id}" rows="4" cols="65" readonly>${comm.text}</textarea><br>
									<input id="comment_${comm.id}_editbutton" type="submit" value="Submit" name="editComment" title="Edit" disabled/>
								</div>
							</form>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
function toggle_visibility(id) {
    var e = document.getElementById(id);
    document.getElementById(id + "_text").readOnly = false;
    document.getElementById(id + "_editbutton").disabled = false;
}
</script>
</body>
</html>


