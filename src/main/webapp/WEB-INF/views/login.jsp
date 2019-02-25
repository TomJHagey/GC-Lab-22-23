<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="post">
	
	<p class="message">${message}</p>
	
		<p>
			<label for="username">Username:</label> <input id="username" name="username" value="${param.username}" required />
		</p>		<p>
			<label for="password">Password:</label> <input id="password" type="password" name="password" required />
		</p>
		<p>
			<button>Submit</button>
		</p>
	</form>
</body>
</html>