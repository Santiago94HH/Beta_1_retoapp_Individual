package com.example.beta_1_retoapp.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta_1_retoapp.models.Prioridad;

@Repository 
public interface IRepositorioPrioridad extends jpaRepository<Prioridad, UUID>{

    // 1. Buscar una prioridad por su nombre exacto
    Optional<Prioridad> findByNombre(String nombre);

    // 2. Buscar prioridades cuyo nombre contenga una palabra clave (ignorando mayúsculas/minúsculas)
    List<Prioridad> findByNombreContainingIgnoreCase(String nombre);

    // 3. Eliminar una prioridad por su nombre
    void deleteByNombre(String nombre);

    // 4. Buscar prioridades por nivel menor o igual a un valor dado
    List<Prioridad> findByNivelLessThanEqual(Integer nivel);



}
