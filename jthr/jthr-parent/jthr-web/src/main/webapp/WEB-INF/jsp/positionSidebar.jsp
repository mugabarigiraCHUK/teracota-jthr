<div class="static_sidebar">
	<style type="text/css" scoped>
		.static_sidebar input[type=submit] {
			width: 120px;
			height: 30px;
			background: #8b2d4b;
			border: 1px solid #fff;
			cursor: pointer;
			color: #fff;
			font-family: 'Exo', sans-serif;
			font-size: 14px;
			font-weight: 400;
			padding: 6px;
			margin-top: 5px;
			margin-left: -1px;
		}
	</style>

<!-- 	<input type="button" name="" value="Add Position" /> <br /> -->
<!-- 	<input type="button" name="" value="Edit Position" /> <br />  -->
<!-- 	<input type="button" name="" value="Clone Position" /> <br /> -->
<!-- 	<input type="button" name="" value="Delete Position" /> <br /> -->
	<form action="position" method="POST">
		<input type="submit" name="addPosition" value="Add Position" /> <br />
		<input type="submit" name="editPosition" value="Edit Position" onClick="<% request.setAttribute("position_id", "1234aa"); %>"/> <br />  
		<input type="submit" name="clonePosition" value="Clone Position" /> <br /> 
		<input type="submit" name="deletePosition" value="Delete Position" /> <br />
	</form>
</div>