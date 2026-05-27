package com.example.model;

public class Leitor extends Usuario {
    private int id_leitor;
    public Leitor(int user_id, String name, String email, String senha, int id_leitor){
        super(user_id, name, email, senha);
        this.id_leitor = id_leitor;
    }
    public int getId_leitor() {
        return id_leitor;
    }
}
