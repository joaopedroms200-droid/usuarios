package com.example.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String name;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
    }
    public Integer getUser_id() {
        return user_id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

}