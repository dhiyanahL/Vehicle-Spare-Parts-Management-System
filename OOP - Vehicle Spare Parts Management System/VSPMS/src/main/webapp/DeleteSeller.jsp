<!-- IT22055262 - LIYAUDEEN D.H - Seller CRUD -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Seller</title>
</head>
<body>


<link rel="stylesheet" type="text/css" href="css/DeleteSeller.css" />

	
	<% 
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	%>
	
	<form action = "delete" method = "post">
	<div class = "delete">
	<h2>Are you sure you wish to delete your account?</h2>
	<table>
		<tr>
			<td class = "label">Seller ID</td>
			<td class = "value"><input type = "text" name = "selid" value = "<%= id %>" readonly></td>
		</tr>
		
		<tr>
			<td class = "label">Seller Name</td>
			<td class = "value"><input type = "text" name = "name" value = "<%= name %>" readonly></td>
		</tr>
		
		<tr>
			<td class = "label">Seller Email</td>
			<td class = "value"><input type = "text" name = "email" value = "<%= email %>" readonly></td>
		</tr>
		
		<tr>
			<td class = "label">Phone Number</td>
			<td class = "value"><input type = "text" name = "number" value = "<%= phone %>" readonly></td>
		</tr>
		
		<tr>
			<td class = "label">Seller Username</td>
			<td class = "value"><input type = "text" name = "uname" value = "<%= username %>" readonly></td>
		</tr>
		<tr>
			<td class = "label">Seller Password</td>
			<td class = "value"><input type = "password" name = "password" value = "<%= password %>" readonly></td>
		</tr>
		
	</table>
		
		<input type = "submit" name = "submit" class= "submit" value = "Delete Seller Profile">
	
	
	
	</div>
	</form>

</body>
</html>