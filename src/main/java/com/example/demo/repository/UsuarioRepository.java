package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.objetos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
