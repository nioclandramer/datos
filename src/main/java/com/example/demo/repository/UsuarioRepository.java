package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.objetos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    List<Usuario> findByNombres(String nombres, String apellidos);

    @Query("SELECT u FROM Usuario u WHERE u.nombre = ?1 AND apellidos = ?2")
    List<Usuario> findByNombresyApellido(String nombres, String apellidos);

    List<Usuario> findByEmail(String username,String email);

    List<Usuario> findByNombreslike(String nombres);

    @Query("SELECT u FROM Usuario U WHERE U.nombre like %?1")
    List<Usuario> findByNombres(String nombres);
}
