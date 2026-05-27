package com.example.controller;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Leitor;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private ArrayList<Leitor> leitores = new ArrayList<>(Arrays.asList(
        new Leitor(1, "Teste", "teste@email.com", "12302", 12412),
        new Leitor(2, "Teste2", "teste2@email.com", "12303", 12413) 
    ));

    @GetMapping("/leitores")
    public ArrayList<Leitor> getLeitores() {
        return leitores;
    }
    
}