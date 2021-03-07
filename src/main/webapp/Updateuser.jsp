<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE USER </title>
</head>
<body>
<form name="updateuser" class="form" method="POST" action="/updateuser/${user.id}">
<label> ID:</label>
<input name="id" type="number" value=${updateuser.id} disabled><br>
<label> NAME :</label>
<input name="name" value=${updateuser.name}  type="text"><br>
<label> EMAIL:</label>
<input name="email" value=${updateuser.email}  type="email"><br>
<button type="submit"> SUBMIT </button><br>
<button type="reset"> RESET  </button>
</form>
</body>
</html>