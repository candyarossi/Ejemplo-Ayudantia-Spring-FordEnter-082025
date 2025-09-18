package com.example.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.interfaces.ManejoDeFechas;
import com.example.models.Videojuego;

import jakarta.servlet.http.HttpSession;

@Controller
// http://localhost:8080/
@RequestMapping("/")
public class ControladorVideojuegos implements ManejoDeFechas {

    private ArrayList<Videojuego> videojuegos;

    public ControladorVideojuegos() {
        this.videojuegos = new ArrayList<Videojuego>();
        Videojuego v1 = new Videojuego(1l, "Silent Hill 2",
                "Having received a letter from his deceased wife, James heads to where they shared so many memories, in the hope of seeing her one more time: Silent Hill.",
                "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/2124490/header.jpg?t=1744248682",
                formatearFecha("2024-10-08"), 4.8, new ArrayList<String>(Arrays.asList("Adventure", "Action")),
                new ArrayList<String>(Arrays.asList("PC", "PlayStation")));
        Videojuego v2 = new Videojuego(2l, "Outlast",
                "Outlast follows the story of investigative journalist Miles Upshur, that got the lead on the inhuman experiments, performed on the asylum patients.",
                "https://shared.akamai.steamstatic.com/store_item_assets/steam/apps/238320/capsule_616x353.jpg?t=1666817106",
                formatearFecha("2013-09-03"), 4.5, new ArrayList<String>(Arrays.asList("Indie", "Action")),
                new ArrayList<String>(Arrays.asList("PC", "PlayStation", "Xbox", "Nintendo")));
        Videojuego v3 = new Videojuego(3l, "Resident Evil 2",
                "The story follows the survivors of a zombie virus outbreak in the fictional Raccoon City.",
                "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/883710/header.jpg?t=1728438541",
                formatearFecha("2019-01-25"), 4.3,
                new ArrayList<String>(Arrays.asList("Shooter", "Action", "Adventure")),
                new ArrayList<String>(Arrays.asList("PC", "PlayStation", "Xbox", "Nintendo")));
        this.videojuegos.add(v1);
        this.videojuegos.add(v2);
        this.videojuegos.add(v3);
    }

    // http://localhost:8080/getAll
    @GetMapping("/getAll")
    public String getVideojuegos(Model modelo, HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        } else {
            modelo.addAttribute("videojuegos", this.videojuegos);
            return "videojuegos.jsp";
        }
    }

    // Query String
    // http://localhost:8080/get?id=4
    @GetMapping("/get")
    public String getByName1(@RequestParam(value = "id") Long id, Model modelo, HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        } else {
            Videojuego v = buscar(id);
            if (v != null) {
                modelo.addAttribute("videojuego", v);
                return "detalle.jsp";
            } else {
                return "redirect:/getAll";
            }
        }
    }

    // Path Variables
    // http://localhost:8080/get/4
    @GetMapping("/get/{id}")
    public String getByName2(@PathVariable("id") Long id, Model modelo, HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        } else {
            Videojuego v = buscar(id);
            if (v != null) {
                modelo.addAttribute("videojuego", v);
                return "detalle.jsp";
            } else {
                return "redirect:/getAll";
            }
        }
    }

    private Videojuego buscar(Long id) {
        Videojuego v = null;
        for (int i = 0; i < videojuegos.size(); i++) {
            if (videojuegos.get(i).getId().equals(id)) {
                v = videojuegos.get(i);
            }
        }
        return v;
    }

    // http://localhost:8080/form/add
    @GetMapping("/form/add")
    public String formAgregar(HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        } else {
            return "agregar.jsp";
        }
    }

    // http://localhost:8080/add
    @PostMapping("/add")
    public String guardar(@RequestParam String nombre,
            @RequestParam String descripcion,
            @RequestParam String portada,
            @RequestParam String fecha_lanzamiento,
            @RequestParam String rating,
            @RequestParam String generos,
            @RequestParam String plataformas,
            HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        } else {
            long id = this.videojuegos.size() + 1;
            Videojuego v = new Videojuego(id,
                    nombre,
                    descripcion,
                    portada,
                    formatearFecha(fecha_lanzamiento),
                    Double.parseDouble(rating),
                    new ArrayList<String>(Arrays.asList(generos)),
                    new ArrayList<String>(Arrays.asList(plataformas)));
            this.videojuegos.add(v);
            return "redirect:/getAll";
        }
    }
}
