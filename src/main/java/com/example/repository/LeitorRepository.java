package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Leitor;

@Repository
public interface LeitorRepository extends JpaRepository<Leitor, Integer> {
}