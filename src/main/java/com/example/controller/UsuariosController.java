package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bibliotecario;
import com.example.model.Leitor;
import com.example.model.Usuario;
import com.example.service.UsuariosService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuariosController {

    @Autowired
    private UsuariosService service;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return service.recuperarUsuarios();
    }

    @PostMapping("/usuarios")
    public void addUsuario(@RequestBody Usuario novo){
        service.salvar(novo);
    }
    @PostMapping("/leitores")
    public void addLeitor(@RequestBody Leitor novo){
        service.salvar(novo);
    }
    @PostMapping("/bibliotecarios")
    public void addBibliotecario(@RequestBody Bibliotecario novo) {
        service.salvar(novo);
    }
    @GetMapping("/leitores")
    public List<Leitor> getLeitores() {
        return service.recuperarLeitores(); 
    }
    @GetMapping("/bibliotecarios")
    public List<Bibliotecario> getBibliotecarios() {
        return service.recuperarBibliotecarios();
    }
}