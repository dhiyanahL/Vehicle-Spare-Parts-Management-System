<!-- IT22055262 - LIYAUDEEN D.H - Seller CRUD -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Seller Dashboard</title>
</head>
<body>



<link rel="stylesheet" type="text/css" href="css/SellerDashboard.css" />
<div class = "seller-profile">
	
	
	<c:forEach var = "sel" items = "${selDetails}">
	
	<c:set var = "id" value = "${sel.id}"/>
	<c:set var ="username" value = "${sel.username}"/>
	<c:set var ="password" value = "${sel.password}"/>
	<c:set var = "name" value = "${sel.name}"/>
	<c:set var = "email" value = "${sel.email}"/>
	<c:set var = "phone" value = "${sel.phone}"/>
	
	<h2>Welcome ${sel.name}</h2><br>
	<table>
	<tr>
		<td class = "label">Seller ID </td>
		<td class = "value"> ${sel.id}</td>
	</tr>
	
	<tr>
		<td class = "label">Seller Username </td>
		<td class = "value"> ${sel.username}</td>
	</tr>
	
	<tr>
		<td class = "label">Seller password </td>
		<td class = "value"> ${sel.password}</td>
	</tr>
	
	
	<tr>
		<td class = "label">Seller Name </td>
		<td class = "value"> ${sel.name}</td>
	</tr>
	
	<tr>
		<td class = "label">Seller Email </td>
		<td class = "value"> ${sel.email}</td>
	</tr>
	
	<tr>
		<td class = "label">Seller Mobile </td>
		<td class = "value"> ${sel.phone}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value = "UpdateSeller.jsp" var ="selupdate">
	<!-- specifies the parameters to be passed when update button is clicked -->
		<c:param name="id" value = "${id}"/>
		<c:param name="username" value = "${username}"/>
		<c:param name="password" value = "${password}"/>
		<c:param name="name" value = "${name}"/>
		<c:param name="email" value = "${email}"/>
		<c:param name="phone" value = "${phone}"/>
		
	</c:url>
	
	<a href = "${selupdate}"> <!-- inside the anchor tag, pass the variable NAME of the c:url tag -->
	<div class = "button-container">
	
		<input type = "button" class = "update" name = "update" value = "Update Profile ">
		</a>
	
		<c:url value = "DeleteSeller.jsp" var = "seldelete">
		<c:param name="id" value = "${id}"/>
		<c:param name="username" value = "${username}"/>
		<c:param name="password" value = "${password}"/>
		<c:param name="name" value = "${name}"/>
		<c:param name="email" value = "${email}"/>
		<c:param name="phone" value = "${phone}"/>
			
		
		</c:url>
	
		<br><br><br>
	
	
		<a href ="${seldelete }">
		<input type = "button" class = "delete" name = "delete" value = "Delete Account">
		</a>
	</div>
</div>




</body>
</html>
