<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<title>Coffee Shop</title>
</head>
<body>

	<form method="post">
	<div class = "container">
	
	<h1>The Coffee Shop</h1>
	<h2>Item List</h2>
	
	

	<table class = "table table-striped">
		
		<th>Name</th>
		<th>Description</th>
		<th>Quantity</th>
		<th>Price</th>
		
		<c:forEach items="${items}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.description}</td>
				<td>${item.quantity}</td>
				<td>${item.price}</td>
				
			</tr>
		</c:forEach>

	</table>
	
	
	<a href="/requestForm"><button type="button" class="btn btn-secondary">Register User</button></a>
	<a href="/login"><button type="button" class="btn btn-primary ml-4">Log in</button></a>
	<a href="/logout"><button type="button" class="btn btn-primary">Log out</button></a>
	<a href="/admin"><button type="button" class="btn btn-info ml-4">Administrator</button></a>

	<p class="message">${message}</p>
	<p> ${profile.firstName} ${profile.lastName} </p>
	
	
	
		



</div>
</form>
</body>
</html>