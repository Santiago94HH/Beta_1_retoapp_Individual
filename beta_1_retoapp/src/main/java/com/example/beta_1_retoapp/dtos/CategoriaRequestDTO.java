package com.example.beta_1_retoapp.dtos;

import com.example.beta_1_retoapp.models.Categoria;

public class CategoriaRequestDTO {

    private String nombre;
    private String descripcion;

//Constructor vacio (necesario para deserialización JSON)
public CategoriaRequestDTO(){

}

//Constructor con parametros

public CategoriaRequestDTO(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
}

//Convierte el DTO a la entidad JPA Categoria

public Categoria toEntity(){
    Categoria categoria = new Categoria();
    categoria.setNombre(this.nombre);
    categoria.setDescripcion(this.descripcion);
    return categoria;
}

//Getters y Setters

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
