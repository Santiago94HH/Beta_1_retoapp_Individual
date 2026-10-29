package com.example.beta_1_retoapp.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta_1_retoapp.models.Registro;
import com.example.beta_1_retoapp.models.Reto;
import com.example.beta_1_retoapp.models.Usuario;

@Repository 
public interface IRepositorioRegistro extends jpaRepository<Registro, UUID> {

// 1. Lista los registros de un usuario
    List<Registro> findByUsuario (Usuario usuario);

// 2. Lista los registros (participantes) de un reto
    List<Registro> findByReto (Reto reto);

// 3. Evita que el mismo usuario se registre dos veces en el mismo reto
    boolean existsByUsuarioAndReto (Usuario usuario, Reto reto);

// 4. Filtra por estado del registro
    List<Registro> findByEstado (String estado);

// 5. Ordena del registro mas reciente al mas antiguo
    List<Registro> findByOrderByFechaRegistroDesc();


}
