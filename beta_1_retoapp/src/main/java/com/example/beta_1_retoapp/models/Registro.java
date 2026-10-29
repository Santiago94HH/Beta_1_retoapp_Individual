package com.example.beta_1_retoapp.models;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "registros")
public class Registro {

@Id 
@GeneratedValue (strategy = GenerationType.UUID)
private UUID id;;

@Column (name = "fecha_registro")
private LocalDateTime fechaRegistro;

@Column (name = "observacion")
private String observacion;

@Column (name = "estado")
private String estado;

//Relación ManyToOne con la entidad Usuario (Llave foránea id_usuario)
@ManyToOne 
@JoinColumn (name = "id_usuario")
private Usuario usuario;

//Relacion ManyToOne con la entidad Reto (Llave foránea)
@ManyToOne 
@JoinColumn (name = "id_reto")
private Reto reto;

//Constructor vacío (requerido por JPA)
public Registro(){

}

// Constructor con parámetros
public Registro(LocalDateTime fechaRegistro, String observacion, String estado, Usuario usuario, Reto reto) {
    this.fechaRegistro = fechaRegistro;
    this.observacion = observacion;
    this.estado = estado;
    this.usuario = usuario;
    this.reto = reto;
}

// Getters y Setters
public UUID getId() {
    return id; 
}

public void setId(UUID id) {
    this.id = id;
}

public LocalDateTime getFechaRegistro() {
    return fechaRegistro;
}

public void setFechaRegistro(LocalDateTime fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
}

public String getObservacion() {
    return observacion;
}

public void setObservacion(String observacion) {
    this.observacion = observacion;
}

public String getEstado() {
    return estado;
}

public void setEstado(String estado) {
    this.estado = estado;
}

public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

public Reto getReto() {
    return reto;
}

public void setReto(Reto reto) {
    this.reto = reto;
}

}
