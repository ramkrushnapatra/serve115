<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body bgcolor="yellow">
<form action="Registration" method="post">

<table align="center">
<tr>
<th colspan="2" style="padding:20px" >Register</th></tr>
<tr>
<td>Name:<input type="text" name="name"></td></tr><br>
<tr><td>Age:<input type="number" name="age"></td></tr><br>
<tr><td>Gender:
Male<input type="radio" name="gender" value="Male">
Female<input type="radio" name="gender" value="female"></td></tr>
<tr><td>Enter Password:<input type="password" name="reenterPass"></td></tr>
<tr><td>Re-Enter Password:<input type="password" name="pass"></td></tr>
<td style="padding:20px"><input type="reset" value="clean"><input type="submit" value="signup"></td>

</table>
</form>
</body>
</html>