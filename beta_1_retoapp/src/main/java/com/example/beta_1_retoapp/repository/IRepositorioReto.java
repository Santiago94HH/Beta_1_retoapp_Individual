package com.example.beta_1_retoapp.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta_1_retoapp.models.Reto;

@Repository 
public interface IRepositorioReto extends jpaRepository<Reto, UUID>{

// 1. Lista los retos de una empresa
    List<Reto> findByEmpresaId(UUID empresaId);

// 2. Lista los retos de una categoria
    List<Reto> findByCategoriaId(UUID categoriaId);

// 3. Lista los retos de una prioridad
    List<Reto> findByPrioridadId(UUID prioridadId);

// 4. Filtra por estado del reto
    List<Reto> findByEstado(String estado);

// 5.Busqueda parcial por nombre
    List<Reto> findByNombreContainingIgnoresCase(String nombre);

// 6. Ordena del reto mas reciente al mas antiguo
    List<Reto> findAllByOrderByFechaInicioDesc();

}
