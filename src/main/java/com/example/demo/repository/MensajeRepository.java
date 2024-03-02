package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.objetos.mensajes;

public interface MensajeRepository extends JpaRepository<mensajes,Long > {
    
}
