<!-- IT22055262 - LIYAUDEEN D.H - Seller CRUD -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Seller Login</title>
</head>
<body>


<link rel="stylesheet" type="text/css" href="css/SellerLogin.css" />

<div class = "login-form">
	<form action ="login" method = "post">
			<h1>Seller Login</h1>
			<br><br>
		
			<div class = "input_textbox">
				<input type = "text" name = "uid" placeholder = "Username" required><br>
			</div>
			<div class = "input_textbox">
				<input type = "password" name = "pass" placeholder = "Password" required><br>
			</div>
			<br>
			
			<input type = "submit" name = "submit" class = "loginButton" value = "Login">
			
			<br><br><br>
			<div class = "register">
				Don't have an account yet?
				<a href = "SellerRegistration.jsp">Sign Up!</a>
			</div>
		
	</form>
</div>

</body>
</html>