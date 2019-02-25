<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<a href="/addForm">Add an Item</a>


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
				<td><a href="/itemEditForm?id=${item.id}">Edit</a></td>
				<td><a href="/deleteItemForm?id=${item.id}">Delete</a></td>
				
			</tr>
		</c:forEach>

	</table>
	
	<a href="/">Return to Homepage</a>

</body>
</html>