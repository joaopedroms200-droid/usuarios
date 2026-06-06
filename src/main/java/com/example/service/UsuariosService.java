package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Bibliotecario;
import com.example.model.Leitor;
import com.example.model.Usuario;
import com.example.repository.BibliotecarioRepository;
import com.example.repository.LeitorRepository;
import com.example.repository.UsuariosRepository;

@Service
public class UsuariosService {
    @Autowired
    private UsuariosRepository repository;
    @Autowired
    private LeitorRepository leitorRepository;
    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;

    public List<Usuario> recuperarUsuarios(){
        return repository.findAll();
    }
    public void salvar(Usuario novo){
        repository.save(novo);
    }
    public void salvar(Leitor novo) {
        leitorRepository.save(novo);
    }
    public void salvar(Bibliotecario novo) {
        bibliotecarioRepository.save(novo);
    }
    public List<Leitor> recuperarLeitores() {
        return leitorRepository.findAll();
    }
    public List<Bibliotecario> recuperarBibliotecarios() {
        return bibliotecarioRepository.findAll();
    }
}
