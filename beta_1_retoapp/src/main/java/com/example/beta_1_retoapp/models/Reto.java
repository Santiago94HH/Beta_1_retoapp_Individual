package com.example.beta_1_retoapp.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table (name = "retos")
public class Reto {

@Id 
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;

@Column (name = "nombre")
private String nombre;

@Column (name = "descripcion")
private String descripcion;

@Column (name = "fecha_inicio")
private LocalDate fechaInicio;

@Column (name = "fecha_fin")
private LocalDate fechaFin;

@Column (name = "estado")
private String estado;

// Relaciones ManyToOne (Llaves foráneas en la tabla "retos")
@ManyToOne 
@JoinColumn (name = "id_empresa")
private Empresa empresa;

@ManyToOne
@JoinColumn (name = "id_categoria")
private Categoria categoria;

@ManyToOne 
@JoinColumn (name = "id_prioridad")
private Prioridad prioridad;

//Relación OneToMany (Lado inverso hacia la entidad puente Registro)
@OneToMany (mappedBy = "reto")
private List<Registro> registros = new ArrayList<>();

// Constructor vacío (requerido por JPA)
public Reto() {
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

    public Empresa getEmpresa() {
    return empresa;
    }

    public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
    }

    public Categoria getCategoria() {
    return categoria;
    }

    public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
    }

    public Prioridad getPrioridad() {
    return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
    this.prioridad = prioridad;
    }

    public List<Registro> getRegistros() {
    return registros;
    }

    public void setRegistros(List<Registro> registros) {
    this.registros = registros;
    }
}

