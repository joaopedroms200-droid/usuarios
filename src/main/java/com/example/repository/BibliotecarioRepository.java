package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Bibliotecario;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Integer> {
}