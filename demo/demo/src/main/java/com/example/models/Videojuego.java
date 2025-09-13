package com.example.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Videojuego {
    private Long id;
    private String nombre;
    private String descripcion;
    private String portada;
    private LocalDate fecha_lanzamiento;
    private Double precio;
    private Double rating;
    private ArrayList<String> generos;
    private ArrayList<String> plataformas;

    public Videojuego() {
    }

    public Videojuego(Long id, String nombre, String descripcion, String portada, LocalDate fecha_lanzamiento,
            Double rating, ArrayList<String> generos, ArrayList<String> plataformas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.portada = portada;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.precio = this.generarPrecioRandom();
        this.rating = rating;
        this.generos = generos;
        this.plataformas = plataformas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public LocalDate getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public ArrayList<String> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(ArrayList<String> plataformas) {
        this.plataformas = plataformas;
    }

    @Override
    public String toString() {
        return "Videojuego [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", portada=" + portada
                + ", fecha_lanzamiento=" + fecha_lanzamiento + ", precio=" + precio + ", rating=" + rating
                + ", generos=" + generos + ", plataformas=" + plataformas + "]";
    }

    private double generarPrecioRandom() {
        return Math.round((ThreadLocalRandom.current().nextDouble(5.0, 150.0)) * 100.0) / 100.0;
    }
}
