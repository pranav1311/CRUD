<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>CREATE NEW USER</title>
</head>
<body>
<form name="user" class="form" method="POST" action="/createuser">
<label> NAME :</label>
<input name="name" type="text"><br>
<label> EMAIL:</label>
<input name="email" type="email"><br>
<button type="submit"> SUBMIT </button><br>
<button type="reset"> RESET  </button>

</form>
</body>
</html>