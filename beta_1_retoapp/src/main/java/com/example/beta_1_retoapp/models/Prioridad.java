package com.example.beta_1_retoapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre; // Ej. "Alta", "Media", "Baja", "Critica"

    @Column(name = "nivel", nullable = false)
    private Integer nivel; // Ej. 1, 2, 3 para definir el orden numérico de prioridad

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    // Apunta al campo "prioridad" definido en la entidad Reto
    @OneToMany(mappedBy = "prioridad", cascade = CascadeType.ALL)
    
    private List<Reto> retos = new ArrayList<>();

}
