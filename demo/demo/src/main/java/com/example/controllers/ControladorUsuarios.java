package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.models.Usuario;
import com.example.services.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;

@Controller
// http://localhost:8080/
@RequestMapping("/")
public class ControladorUsuarios {

    // private ArrayList<Usuario> usuarios = new ArrayList<>();

    @Autowired
    private ServicioUsuarios servicioUsuarios;

    // http://localhost:8080/
    @GetMapping("/")
    public String inicio(HttpSession sesion) {
        sesion.invalidate();
        return "login.jsp";
    }

    // http://localhost:8080/login
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession sesion) {
        // Usuario user = buscar(email, password);
        Usuario user = servicioUsuarios.obtenerUsuarioPorEmail(email, password);
        if (user != null) {
            sesion.setAttribute("nombreUsuario", user.getNombre() + " " + user.getApellido());
            sesion.setAttribute("emailUsuario", user.getEmail());
            sesion.setAttribute("idUsuario", user.getId());
            sesion.setAttribute("coinsUsuario", user.getCoins());
            return "redirect:/getAll";
        } else {
            return "redirect:/";
        }
    }

    // http://localhost:8080/register
    @PostMapping("/register")
    public String register(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String email,
            @RequestParam String password, HttpSession sesion) {

        // long id = this.usuarios.size() + 1;
        Usuario newUser = new Usuario(nombre, apellido, email, password);
        // usuarios.add(newUser);
        servicioUsuarios.crearUsuario(newUser);
        sesion.setAttribute("nombreUsuario", newUser.getNombre() + " " + newUser.getApellido());
        sesion.setAttribute("emailUsuario", newUser.getEmail());
        sesion.setAttribute("idUsuario", newUser.getId());
        sesion.setAttribute("coinsUsuario", newUser.getCoins());
        return "redirect:/getAll";
    }

    /*
     * private Usuario buscar(String email, String password) {
     * Usuario u = null;
     * for (int i = 0; i < usuarios.size(); i++) {
     * if (usuarios.get(i).getEmail().equals(email)) {
     * if (usuarios.get(i).getPassword().equals(password)) {
     * u = usuarios.get(i);
     * }
     * }
     * }
     * return u;
     * }
     */

    // http://localhost:8080/logout
    @GetMapping("/logout")
    public String logout(HttpSession sesion) {
        sesion.invalidate();
        return "redirect:/";
    }
}
