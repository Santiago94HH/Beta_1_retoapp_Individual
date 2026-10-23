package com.example.beta_1_retoapp.controllers;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beta_1_retoapp.models.Empresa;
import com.example.beta_1_retoapp.services.ServicioEmpresa;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping ("/api/usuarios")
public class UsuarioEmpresa {

    @Autowired 
    ServicioEmpresa servicioEmpresa;

    //Controlador para guardar
    
    @PostMapping
    public ResponseEntity <?> guardar(@RequestBody Empresa datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicioEmpresa.Guardar(datos)
        );
    } 

    //Controlador para buscar

    
    public ResponseEntity<?> buscar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicioEmpresa.buscarEmpresaPorId("id"));
    }

    //Controlador para modificar

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable UUID id, Empresa datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicioEmpresa.modificar(id, datos));
    }
    //Controlador para eliminar

    @DeleteMapping ("/{id}")    
    public ResponseEntity<?> eliminar(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(servicioEmpresa.eliminarEmpresa("id"));
    } 
}
