package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "leitores")
@PrimaryKeyJoinColumn(name = "id_leitor")
public class Leitor extends Usuario {
    public Leitor() {
        super();
    }
    public Leitor(String name, String email, String senha){
        super(name, email, senha);
    }
    public Integer getId_leitor() {
        return super.getUser_id();
    }
}
