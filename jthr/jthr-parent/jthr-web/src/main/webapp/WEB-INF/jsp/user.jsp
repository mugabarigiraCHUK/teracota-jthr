<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu/swimbi.css"/> 
<link rel="stylesheet" href="table.css" type="text/css" />
<link rel="stylesheet" href="userMenu.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JT HR</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	
	<div class="menu">
		<ul>
			<li><a href="#">Link 1</a></li>
			<li><a href="#">Link 2</a></li>
			<li><a href="#">Link 3</a></li>
			<li><a href="#">Link 4</a></li>
			<li><a href="#">Link 5</a></li>
		</ul>
		<br />
	</div>

	<!-- <form action="login" method="POST">
		<table border="0">
			<tr>
				<td><input type="submit" value="Add User" name="submit"></td>
				<td><input type="submit" value="Delete User" name="submit"></td>
				<td><input type="submit" value="Edit User" name="submit"></td>
				<td><input type="text" name="username"></td>
				<td><input type="submit" value="Search" name="submit"></td>
				<td>by</td>
				<td><select>
						<option value="fname">First Name</option>
						<option value="lname">Last Name</option>
						<option value="jobPoz">Job Position</option>
						<option value="email">E-mail</option>
				</select></td>
			</tr>
		</table>
	</form> -->
	
	<br><br><br>
	
	<!-- <table class="userTable" style="width:300px" border="1px solid black">
	<tr>
		<th>First Name</th>
  		<th>Last Name</th>
  		<th>Phone Number</th>		
  		<th>Mobile Number</th>
  		<th>E-mail</th>
  		<th>Job Position</th>
  		<th>Description</th>
	</tr>	
	
	<tr>
        	<td>Adam</td>
            <td>Gazsi</td>
            <td>0987654432</td>  
            <td>0712383746</td>
            <td>adam@adam.ciolo</td>
            <td>Boss</td>
            <td>Teracota Dreamer</td>
    </tr>
    
    <tr>
        	<td>Razvan</td>
            <td>Bogdan</td>
            <td>1342243340</td>  
            <td>0742343436</td>
            <td>razvi@bogdi.ciolo</td>
            <td>Don</td>
            <td>Trotineta</td>
    </tr>
	
	<tr>
        	<td>Catalin</td>
            <td>Ciolocoiu</td>
            <td>1234567890</td>  
            <td>0712383746</td>
            <td>ciolo@ciolo.ciolo</td>
            <td>Sef</td>
            <td>TREBE TREBE INSTALL</td>
    </tr>
	
	
	</table> -->
	
	<div class="CSSTable" >
                <table >
                    <tr>
                    	<td>Select</td>
						<td>First Name</td>
						<td>Last Name</td>
						<td>Phone Number</td>
						<td>Mobile Number</td>
						<td>E-mail</td>
						<td>Job Position</td>
						<td>Description</td>
					</tr>
                    <tr>
                    	<td><input type="checkbox" name="vehicle" value="Bike"></td>
                       	<td>Adam</td>
			            <td>Gazsi</td>
			            <td>0987654432</td>  
			            <td>0712383746</td>
			            <td>adam@adam.ciolo</td>
			            <td>Boss</td>
			            <td>Teracota Dreamer</td>
                    </tr>
                    <tr>                    	
                    	<td><input type="checkbox" name="vehicle" value="Bike"></td>
                        <td>Razvan</td>
			            <td>Bogdan</td>
			            <td>1342243340</td>  
			            <td>0742343436</td>
			            <td>razvi@bogdi.ciolo</td>
			            <td>Don</td>
			            <td>Trotineta</td>
                    </tr>
                    <tr>
                    	<td><input type="checkbox" name="vehicle" value="Bike"></td>
                        <td>Catalin</td>
			            <td>Ciolocoiu</td>
			            <td>1234567890</td>  
			            <td>0712383746</td>
			            <td>ciolo@ciolo.ciolo</td>
			            <td>Sef</td>
			            <td>TREBE TREBE INSTALL</td>
                    </tr>
                    <tr>
                    	<td><input type="checkbox" name="vehicle" value="Bike"></td>
                        <td>test</td>
			            <td>test</td>
			            <td>test</td>  
			            <td>test</td>
			            <td>test</td>
			            <td>test</td>
			            <td>test</td>
                    </tr>
                </table>
            </div>
            

</body>
</html>