<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
<form action="Login" method="post">
<table align="center">
<tr>
<p><b><center>LOGIN PAGE</center></b></p>
<td>UserId:</td><td><input type="text" name="UserID"></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
<tr><td>
User<input type="radio" name="Type" value="user">
Admin<input type="radio" name="Type" value="admin"></td></tr>

<tr><td><a href="LoginUser.jsp">LOGIN</a></td></tr>
<tr><td><a href="Registration.jsp">REGISTER</a></td></tr>
</table>
</form>
</body>
</html>
