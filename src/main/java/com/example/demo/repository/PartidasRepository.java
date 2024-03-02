package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.objetos.partidas;

public interface PartidasRepository extends JpaRepository<partidas,Long>{
    
}
