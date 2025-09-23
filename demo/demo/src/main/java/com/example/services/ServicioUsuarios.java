package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Usuario;
import com.example.repositories.RepositorioUsuarios;

@Service
public class ServicioUsuarios {

    @Autowired
    private RepositorioUsuarios repositorioUsuarios;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return (List<Usuario>) this.repositorioUsuarios.findAll();
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        return this.repositorioUsuarios.findById(id).orElse(null);
    }

    public Usuario obtenerUsuarioPorEmail(String email, String password) {
        Usuario user = this.repositorioUsuarios.findByEmail(email).orElse(null);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public Usuario crearUsuario(Usuario usuario) {
        return this.repositorioUsuarios.save(usuario);
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        return this.repositorioUsuarios.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        this.repositorioUsuarios.deleteById(id);
    }
}
