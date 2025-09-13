package com.example.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.interfaces.ManejoDeFechas;
import com.example.models.Videojuego;

@Controller
// http://localhost:8080/getAll
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

    @GetMapping("/getAll")
    public String getVideojuegos(Model modelo) {
        modelo.addAttribute("videojuegos", this.videojuegos);
        return "videojuegos.jsp";
    }
}
