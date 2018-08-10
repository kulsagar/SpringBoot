<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Search Here..</h1>
	<form action="/welcome">
		<label>Id</label>
		<input type="text" name="id" value="13">
		<input type="submit">
	</form>
	<br>
	<h1>
		id = ${message.id} </br>
		text = ${message.text} </br>
		sender = ${message.sender.name} </br>
	</h1>
</body>
</html>