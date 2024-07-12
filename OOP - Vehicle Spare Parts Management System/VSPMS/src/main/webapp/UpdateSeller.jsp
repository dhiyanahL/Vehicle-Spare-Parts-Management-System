<!-- IT22055262 - LIYAUDEEN D.H - Seller CRUD -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
</head>
<body>



<link rel="stylesheet" type="text/css" href="css/UpdateSeller.css" />
	
	<% 
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	%>
	<div class = "updateClass">
	<form action = "update" method = "post">
	<h2>Update Your Profile</h2>
	<table>
		<tr>
			<td class = "label">Seller ID</td>
			<td class = "value"><input type = "text" name = "selid" value = "<%= id %>" readonly></td>
		</tr>
		
		<tr>
			<td class = "label">Seller Name</td>
			<td class = "value"><input type = "text" name = "name" value = "<%= name %>"></td>
		</tr>
		
		<tr>
			<td class = "label">Seller Email</td>
			<td class = "value"><input type = "text" name = "email" value = "<%= email %>"></td>
		</tr>
		
		<tr>
			<td class = "label">Phone Number</td>
			<td class = "value"><input type = "text" name = "number" value = "<%= phone %>"></td>
		</tr>
		
		<tr>
			<td class = "label">Seller Username</td>
			<td class = "value"><input type = "text" name = "uname" value = "<%= username %>"></td>
		</tr>
		<tr>
			<td class = "label">Seller Password</td>
			<td class = "value"><input type = "password" name = "password" value = "<%= password %>"></td>
		</tr>
		
	</table>
		
		<input type = "submit" name = "submit" value = "Update Seller Profile">
	
	
	
	
	</form>
	</div>
	
</body>
</html>