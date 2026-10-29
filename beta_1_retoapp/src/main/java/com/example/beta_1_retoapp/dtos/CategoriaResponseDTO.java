package com.example.beta_1_retoapp.dtos;

import java.util.UUID;

import com.example.beta_1_retoapp.models.Categoria;

public class CategoriaResponseDTO {

    private UUID id;
    private String nombre;
    private String descripcion;

//Constructor vacio
public CategoriaResponseDTO(){

}

//Constructor con parametros

public CategoriaResponseDTO(UUID id, String nombre, String descripcion) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
}

//Metodo estatico entidad categoria a DTO
public static CategoriaResponseDTO fromEntity (Categoria categoria){
    if (categoria == null){
        return null;
    }
    return new CategoriaResponseDTO(
        categoria.getId(),
        categoria.getNombre(),
        categoria.getDescripcion()
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

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

}
