package com.example.beta_1_retoapp.repository;

import org.springframework.stereotype.Repository;
import com.example.beta_1_retoapp.models.Empresa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository 
public interface IRepositorioEmpresa extends jpaRepository<Empresa, UUID>{

    // 1. Buscar una empresa por su RUC o NIT exacto
    Optional<Empresa> findByid(UUID id); 

    // 2. Buscar una empresa por su nombre o razón social exacta
    Optional<Empresa> findByNombre(String nombre);

    // 3. Buscar empresas cuyo nombre o razón social contenga una palabra clave (ignorando mayúsculas/minúsculas)
    List<Empresa> findByNombreContainingIgnoreCase(String nombre);

    // 4. Buscar empresas por ciudad o ubicación
    List<Empresa> findByCiudadIgnoreCase(String ciudad);

    // 5. Eliminar una empresa por su RUC o NIT
    void deleteById(UUID id);

}
