package com.example.beta_1_retoapp.dtos;

import java.time.LocalDate;
import java.util.UUID;

import com.example.beta_1_retoapp.models.Reto;

public class RetoResponseDTO {

    private UUID id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    private UUID empresaId;
    private UUID categoriaId;
    private UUID prioridadId;

//Constructor vacio
public RetoResponseDTO(){

}

//Constructor con parametros

public RetoResponseDTO(UUID id, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin,
        String estado, UUID empresaId, UUID categoriaId, UUID prioridadId) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.estado = estado;
    this.empresaId = empresaId;
    this.categoriaId = categoriaId;
    this.prioridadId = prioridadId;
}

//Mapeo entidad Reto a DTO
public static RetoResponseDTO fromEntity (Reto reto){
    if (reto == null){
        return null;
    }
        UUID empresaId = (reto.getEmpresa() != null) ? reto.getEmpresa().getId() : null;
        UUID categoriaId = (reto.getCategoria() != null) ? reto.getCategoria().getId() : null;
        UUID prioridadId = (reto.getPrioridad() != null) ? reto.getPrioridad().getId() : null;

        return new RetoResponseDTO(
            reto.getId(),
            reto.getNombre(),
            reto.getDescripcion(),
            reto.getFechaInicio(),
            reto.getFechaFin(),
            reto.getEstado(),
            empresaId,
            categoriaId,
            prioridadId
        );

    }

// Getters y Setters

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

    public UUID getPrioridadId() {
        return prioridadId;
    }

    public void setPrioridadId(UUID prioridadId) {
        this.prioridadId = prioridadId;
    }


}
