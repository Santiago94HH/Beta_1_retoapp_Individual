package com.example.beta_1_retoapp.dtos;

import com.example.beta_1_retoapp.models.Prioridad;

public class PrioridadRequestDTO {

    private String nombre;
    private Integer nivel;

//Contructor vacio (deserealizacion JSON)
public PrioridadRequestDTO(){

}

//Constructor con parametros

public PrioridadRequestDTO(String nombre, Integer nivel) {
    this.nombre = nombre;
    this.nivel = nivel;
}

//Convertir el DTO a la entidad JPA Prioridad
public Prioridad toEntity(){
    Prioridad prioridad = new Prioridad();
    prioridad.setNombre(this.nombre);
    prioridad.setNivel(this.nivel);
    return prioridad;
}

//Getters y Setters

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
