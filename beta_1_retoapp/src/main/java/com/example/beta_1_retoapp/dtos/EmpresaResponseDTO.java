package com.example.beta_1_retoapp.dtos;

import java.util.UUID;

import com.example.beta_1_retoapp.models.Empresa;

public class EmpresaResponseDTO {

    private UUID id;
    private String nombre;
    private String nit;
    private String sector;
    private String contacto;
    private String correo;
    private String telefono;
    private boolean activa;
    
//Constructor vacio
    public EmpresaResponseDTO(){

}

//Constructor con parámetros
public EmpresaResponseDTO (UUID id, String nombre, String nit, String correo, String telefono, boolean activa){
    this.id = id;
    this.nombre = nombre;
    this.nit = nit;
    this.correo = correo;
    this.telefono = telefono;
    this.activa = activa;
    }

//Conversion entidad DTO
public static EmpresaResponseDTO fromEntity (Empresa empresa){
    if (empresa == null){
        return null;
    }
    return new EmpresaResponseDTO(
        empresa.getId(),
        empresa.getNombre(),
        empresa.getNit(),
        empresa.getCorreo(),
        empresa.getTelefono(),
        empresa.getActiva()
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

public String getNit() {
    return nit;
}

public void setNit(String nit) {
    this.nit = nit;
}

public String getSector() {
    return sector;
}

public void setSector(String sector) {
    this.sector = sector;
}

public String getContacto() {
    return contacto;
}

public void setContacto(String contacto) {
    this.contacto = contacto;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public boolean isActiva() {
    return activa;
}

public void setActiva(boolean activa) {
    this.activa = activa;
}
        
}
