<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="verify.js"> </script>
<title>Registration</title>
</head>
<body>
<form onSubmit="return verify()" action="Register" method="post">
<table>
<tr>
<td><h3>REGISTRATION PAGE</h3></td><td></td>
</tr>
<tr><td>UserName: </td><td><input type="text" name="uname"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>
<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr><td></td><td><input type="submit" value="register"></td></tr>
<tr><td><a href="login.jsp">Login Here</a></td></tr>
</table>
</form>
</body>
</html>