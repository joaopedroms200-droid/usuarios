package com.example.model;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "bibliotecarios")
@PrimaryKeyJoinColumn(name = "id_bibliotecario")
public class Bibliotecario extends Usuario{

    public Bibliotecario() {
        super();
    }
    public Bibliotecario(String name, String email, String senha){
        super(name, email, senha);
    }
    public Integer getId_bibliotecario() {
        return super.getUser_id();
    }
    
}
