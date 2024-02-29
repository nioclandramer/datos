package com.example.demo.objetos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class partidas {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String creador;
  private String deporte;
  private String ciudad;
  private String provincia;
  private LocalDateTime fecha;
  private LocalDateTime hora_Comienzo;
  private LocalDateTime hora_final;
  private Integer participantes;
  private Integer suplentes;
  private String comentario;
  @ManyToMany
  @JoinTable(
    name = "partidas_usuarios",
    joinColumns = @JoinColumn(name = "partidas_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name= "usuarios_id",referencedColumnName = "id") 
  )
private List<Usuario> usuario =new ArrayList<>();

}
