package com.example.beta_1_retoapp.dtos;

import java.util.UUID;

import com.example.beta_1_retoapp.models.Prioridad;

public class PrioridadResponseDTO {
    private UUID id;
    private String nombre;
    private Integer nivel;

//Constructor vacio
public PrioridadResponseDTO(){

}

//Constructor con parametros

public PrioridadResponseDTO(UUID id, String nombre, Integer nivel) {
    this.id = id;
    this.nombre = nombre;
    this.nivel = nivel;
}

//Metodo estatico Entidad Prioridad a DTO
public static PrioridadResponseDTO fromEntity (Prioridad prioridad){
    if (prioridad == null){
        return null;
    }
    return new PrioridadResponseDTO(
        prioridad.getId(),
        prioridad.getNombre(),
        prioridad.getNivel()
    );
}

//Getters y Setters

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Integer getNivel() {
    return nivel;
}

public void setNivel(Integer nivel) {
    this.nivel = nivel;
}

}
