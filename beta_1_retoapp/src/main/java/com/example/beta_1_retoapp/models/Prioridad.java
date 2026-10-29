package com.example.beta_1_retoapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nombre")
    private String nombre; 

    @Column(name = "nivel")
    private Integer nivel; 

    @Column(name = "descripcion")
    private String descripcion;

    // Apunta al campo "prioridad" definido en la entidad Reto
    @OneToMany(mappedBy = "prioridad")
    
    private List<Reto> retos = new ArrayList<>();

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

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public List<Reto> getRetos() {
    return retos;
}

public void setRetos(List<Reto> retos) {
    this.retos = retos;
}

    
}
