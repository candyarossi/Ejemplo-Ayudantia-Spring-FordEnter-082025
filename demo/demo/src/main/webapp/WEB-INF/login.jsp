<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar Sesi&oacute;n</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div class="content">
	<form action="/register" method="POST">
		<h2>Registrarse</h2>
		
		<label for="nombre">Nombre:</label>
		<input type="text" name="nombre">

		<label for="apellido">Apellido:</label>
		<input type="text" name="apellido">

		<label for="email">Email:</label>
		<input type="email" name="email">

		<label for="password">Contrase&ntilde;a:</label>
		<input type="password" name="password">

		<input type="submit" value="Registrarse">
	</form>

	<form action="/login" method="POST">
		<h2>Iniciar Sesi&oacute;n</h2>
		
		<label for="email">Email:</label>
		<input type="email" name="email">

		<label for="password">Contrase&ntilde;a:</label>
		<input type="password" name="password">

		<input type="submit" value="Iniciar Sesi&oacute;n">
	</form>
</div>
</body>
</html>