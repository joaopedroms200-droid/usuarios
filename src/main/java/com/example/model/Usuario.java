package com.example.model;

public class Usuario {
    private int user_id;
    private String name;
    private String email;
    private String senha;

    public Usuario(int user_id, String name, String email, String senha) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }
    public int getUser_id() {
        return user_id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

}