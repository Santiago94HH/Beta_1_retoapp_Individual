package com.example.beta_1_retoapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table (name = "usuarios")
public class Usuario {

@Id 
@GeneratedValue (strategy = GenerationType.UUID)
private UUID id;  

@Column (name = "nombre")
private String nombre;

@Column (name = "correo")
private String correo;

@Column (name = "contrasena")
private String contrasena;

// Relación inversa OneToMany hacia la entidad puente Registro
@OneToMany (mappedBy = "Usuario")
private List<Registro> registros = new ArrayList<>();

// Constructor vacío (requerido por JPA)
public Usuario(){

}

//Constructor con parámetros
public Usuario(String nombre, String correo, String contrasena) {
    this.nombre = nombre;
    this.correo = correo;
    this.contrasena = contrasena;
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

public String getCorreo() {
    return correo;
}
public void setCorreo(String correo) {
    this.correo = correo;
}

public String getContrasena() {
    return contrasena;
}
public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}

public List<Registro> getRegistros() {
    return registros;
}
public void setRegistros(List<Registro> registros) {
    this.registros = registros;
}

}
