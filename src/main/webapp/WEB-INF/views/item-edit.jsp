<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Item</title>
</head>
<body>

		<form method="post">
			
			<input type="hidden" name="id" value="${item.id}" />
			
			    <label for="name">Name</label>
			    <input id="name" name="name" value="${item.name}" required>
			
			
			    <label for="description">Description</label>
			    <input id="decription" name="description" value="${item.description}" required>
			
			
			    <label for="quantity">Quantity</label>
			    <input id="quantity" name="quantity" value="${item.quantity}" required>
			
				
				<label for="price">Price</label>
			    <input id="price" name="price" value="${item.price}" required>
			
			
			<button type="submit">Submit</button>
			
		</form>
		
	

</body>
</html>