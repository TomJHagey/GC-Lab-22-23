<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>

	<a href="/requestForm">Fill out this form to register</a>

	<table border="1">
		
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
	
	<a href="/addForm">Add an Item</a>




</body>
</html>