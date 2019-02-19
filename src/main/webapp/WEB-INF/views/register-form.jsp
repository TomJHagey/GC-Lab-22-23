<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register User</h1>
	
	<form action="/registerForm">
		<p>First Name: <input type="text" required name="firstName" /> </p>
		<p>Last Name: <input type="text" required name="lastName" /> </p>
		<p>Email: <input type="email" required name="email" /> </p>
		<p>Phone Number: <input type="number" required  name="phoneNumber"/> </p>
		<p>Password: <input type="password" required name="password"/> </p>
		
		<p>
			<button type="submit">submit</button>
		</p>
	</form>

</body>
</html>