package com.example.beta_1_retoapp.dtos;

import com.example.beta_1_retoapp.models.Empresa;

public class EmpresaRequestDTO {

    private String nombre;
    private String nit;
    private String sector;
    private String contacto;
    private String telefono;
    private boolean activa;

    //Constructor vacio
    public EmpresaRequestDTO(){

    }

    // Constructor con parámetros
    public EmpresaRequestDTO (String nombre, String nit, String sector, String contacto, boolean activa){
    this.nombre = nombre;
    this.nit = nit;
    this.sector = sector;
    this.contacto = contacto;
    this.activa = activa;
    }

    
    public Empresa toEntity(){
        Empresa empresa = new Empresa();
        empresa.setNombre(this.nombre);
        empresa.setNit(this.nit);
        empresa.setSector(this.sector);
        empresa.setContacto(this.contacto);
        return empresa;  
        

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
