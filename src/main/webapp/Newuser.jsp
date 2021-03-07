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
<div class=form-group> 
<form class="form-group" name="user" class="form" method="POST" action="/createuser">
<div class=form-group> 
<label> NAME :</label>
<input name="name" type="text" class="form-group"><br></div>
<div class=form-group> 

<label> EMAIL:</label>
<input name="email" type="email" class="form-group"><br></div>
<button type="submit" class="btn btn-primary"> SUBMIT </button><br><br><br>
<button type="reset" class="btn btn-primary"> RESET  </button>
</div>
</form>
</body>
</html>