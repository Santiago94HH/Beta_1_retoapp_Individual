package com.example.beta_1_retoapp.dtos;

import java.time.LocalDate;
import java.util.UUID;

import com.example.beta_1_retoapp.models.Categoria;
import com.example.beta_1_retoapp.models.Empresa;
import com.example.beta_1_retoapp.models.Prioridad;
import com.example.beta_1_retoapp.models.Reto;

public class RetoRequestDTO {

    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;

//Las relaciones se reciben como IDs
private UUID empresaId;
private UUID categoriaId;
private UUID prioridaId;

//Constructor vacio
public RetoRequestDTO() {   
}

//Constructor con parametros
public RetoRequestDTO(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String estado,
        UUID empresaId, UUID categoriaId, UUID prioridaId) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.estado = estado;
    this.empresaId = empresaId;
    this.categoriaId = categoriaId;
    this.prioridaId = prioridaId;
}
//Convertir el DTO a la entidad JPA
public Reto toEntity (Empresa empresa, Categoria categoria, Prioridad prioridad) {
        Reto reto = new Reto();
        reto.setNombre(this.nombre);
        reto.setDescripcion(this.descripcion);
        reto.setFechaInicio(this.fechaInicio);
        reto.setFechaFin(this.fechaFin);
        reto.setEstado(this.estado);
        reto.setEmpresa(empresa);
        reto.setCategoria(categoria);
        reto.setPrioridad(prioridad);
        return reto;
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

public LocalDate getFechaInicio() {
    return fechaInicio;
}

public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
}

public LocalDate getFechaFin() {
    return fechaFin;
}

public void setFechaFin(LocalDate fechaFin) {
    this.fechaFin = fechaFin;
}

public String getEstado() {
    return estado;
}

public void setEstado(String estado) {
    this.estado = estado;
}

public UUID getEmpresaId() {
    return empresaId;
}

public void setEmpresaId(UUID empresaId) {
    this.empresaId = empresaId;
}

public UUID getCategoriaId() {
    return categoriaId;
}

public void setCategoriaId(UUID categoriaId) {
    this.categoriaId = categoriaId;
}

public UUID getPrioridaId() {
    return prioridaId;
}

public void setPrioridaId(UUID prioridaId) {
    this.prioridaId = prioridaId;
}


}
