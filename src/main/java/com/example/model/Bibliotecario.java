package com.example.model;

public class Bibliotecario extends Usuario{
    private int id_bibliotecario;
    public Bibliotecario(int user_id, String name, String email, String senha, int id_leitor){
        super(user_id, name, email, senha);
        this.id_bibliotecario = id_bibliotecario;
    }
    public int getId_bibliotecario() {
        return id_bibliotecario;
    }
    
}
