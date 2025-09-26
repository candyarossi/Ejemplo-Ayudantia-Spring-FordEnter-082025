<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Videojuegos</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="nav">
		<h3>&iexcl;Bienvenido ${nombreUsuario}&excl;</h3>
		<h3 class="precio" id="coins">$${coinsUsuario}</h3>
		<a href="/form/add">Crear Juego</a>
		<a href="/logout">Salir</a>
	</div>
	<div class="content">
	    <div class="vComunidad">
	        <h1>Videojuegos de la Comunidad</h1>
	        <ul class="videojuegos">
		        <c:forEach var="jueguito" items="${videojuegos}">
			        <li>
			            <img src="
				            <c:if test="${jueguito.portada != null}">
					            ${jueguito.portada}
				            </c:if>
				            <c:if test="${jueguito.portada == ''}">
					             https://t3.ftcdn.net/jpg/04/84/88/76/360_F_484887682_Mx57wpHG4lKrPAG0y7Q8Q7bJ952J3TTO.jpg
				            </c:if>
			            "/>
			            <h3>${jueguito.nombre}</h3>
			            <a href="/get/${jueguito.id}">Detalles</a>
						<c:if test="${jueguito.creador.id != idUsuario}">
			            	<a class="precio" href="/buy/${jueguito.id}">$${jueguito.precio}</a>
						</c:if>
			        </li>
		        </c:forEach>
	        </ul>
			<h1>Mis Videojuegos</h1>
			<ul class="videojuegos">
				<c:forEach var="jueguito" items="${misVideojuegos}">
					<li>
						<img src="
							<c:if test="${jueguito.portada != null}">
								${jueguito.portada}
							</c:if>
							<c:if test="${jueguito.portada == ''}">
					 			https://t3.ftcdn.net/jpg/04/84/88/76/360_F_484887682_Mx57wpHG4lKrPAG0y7Q8Q7bJ952J3TTO.jpg
							</c:if>
						"/>
						<h3>${jueguito.nombre}</h3>
						<a href="/detalle/${jueguito.id}?fuente=db">Detalles</a>
					</li>
				</c:forEach>
			</ul>
	    </div>
	</div>
	<script src="/js/script.js"></script>
</body>
</html>