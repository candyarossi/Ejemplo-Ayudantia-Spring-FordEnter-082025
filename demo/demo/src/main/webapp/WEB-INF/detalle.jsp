<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle Videojuego</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div id="detalle">
	<div>
	<img src="${videojuego.portada}"/>
	<div>
	<h1>${videojuego.nombre}</h1>
	<ul>
		<li>Rating: &#160;&#160;<b>${videojuego.rating}</b> <span>&#9733;</span></li>
		<li>Fecha Lanzamiento: &#160;&#160;<b>${videojuego.fecha_lanzamiento}</b></li>
		<li>G&eacute;neros: 
			<ol>
				<c:forEach var="genero" items="${videojuego.generos}">
					<li class="gen ${genero}">${genero}</li>
				</c:forEach>
			</ol>
		</li>
		<li>Plataformas: 
			<ol>
				<c:forEach var="plataforma" items="${videojuego.plataformas}">
					<li class="plat">${plataforma}</li>
				</c:forEach>
			</ol>
		</li>
	</ul>
	</div>
	</div>
	<p>${videojuego.descripcion}</p>
	<a href="/getAll">Volver</a>
</div>
</body>
</html>