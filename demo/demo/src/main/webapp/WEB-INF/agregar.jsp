<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Agregar Juego</title>
    <link rel="stylesheet" href="/css/styles.css" />
  </head>
  <body>
    <h1>Agregar Videojuego:</h1>
    <form action="/add" method="POST">
      <label for="nombre">Nombre:</label>
      <input type="text" name="nombre" />

      <label for="descripcion">Descripci&oacute;n:</label>
      <textarea name="descripcion"></textarea>

      <label for="portada">Portada:</label>
      <input type="url" name="portada" />

      <label for="fecha_lanzamiento">Fecha Lanzamiento:</label>
      <input type="date" name="fecha_lanzamiento" />

      <label for="rating">Rating:</label>
      <input type="number" name="rating" step="0.1" max="5" />

      <label for="generos">G&eacute;neros:</label>
      <select name="generos" multiple>
        <option>Adventure</option>
        <option>Indie</option>
        <option>Action</option>
        <option>Shooter</option>
      </select>

      <label for="plataformas">Plataformas:</label>
      <select name="plataformas" multiple>
        <option>PC</option>
        <option>PlayStation</option>
        <option>Xbox</option>
        <option>Nintendo</option>
      </select>

      <input type="submit" value="Crear" />
    </form>
    <a href="/getAll">Volver</a>
  </body>
</html>