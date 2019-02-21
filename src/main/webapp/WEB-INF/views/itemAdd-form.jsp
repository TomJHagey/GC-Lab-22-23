<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/itemAddForm">
		<p>Name: <input type="text" required name="name" /> </p>
		<p>Description: <input type="text" required name="description" /> </p>
		<p>Quantity: <input type="text" required name="quantity" /> </p>
		<p>Price: <input type="text" required  name="price"/> </p>
		
		
		<p>
			<button type="submit">submit</button>
		</p>
	</form>

</body>
</html>