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
	<img src="
		<c:if test="${videojuego.portada != null}">
			${videojuego.portada}
		</c:if>
		<c:if test="${videojuego.portada == ''}">
				https://t3.ftcdn.net/jpg/04/84/88/76/360_F_484887682_Mx57wpHG4lKrPAG0y7Q8Q7bJ952J3TTO.jpg
		</c:if>
	"/>
	<div>
	<h1>${videojuego.nombre}</h1>
	<ul>
		<li>Rating: &#160;&#160;<b>${videojuego.rating}</b> <span>&#9733;</span></li>
		<li>Fecha Lanzamiento: &#160;&#160;<b>${videojuego.fecha_lanzamiento}</b></li>
		<%--<li>G&eacute;neros: 
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
		</li>--%>
	</ul>
	</div>
	</div>
	<p>${videojuego.descripcion}</p>
	<a href="/getAll">Volver</a>
</div>
</body>
</html>