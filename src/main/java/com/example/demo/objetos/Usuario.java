package com.example.demo.objetos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String password;
    private String rep_password;
    private Boolean enabled;
    private String foto;
    private String rol;
    private LocalDateTime create_at;
    @OneToMany(mappedBy = "usuario")
    private List<mensajes> ensajes;
    @OneToMany(mappedBy = "usuario")
    private List<sugerencias> ugerencias;
    @ManyToMany(mappedBy = "usuarios")
    private List<partidas> partidas = new ArrayList<>();

    
}
