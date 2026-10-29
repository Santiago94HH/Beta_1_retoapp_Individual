package com.example.beta_1_retoapp.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta_1_retoapp.models.Categoria;

@Repository 
public interface IRepositorioCategoria extends jpaRepository <Categoria, UUID>{

    //1.Busca la categoría por su nombre exacto
    Optional<Categoria> findByNombre(String nombre);

    //2.Comprueba que el nombre no este repetido antes de crear
    boolean existsByNombre (String nombre);

    //3.Busqueda parcial por nombre
    List<Categoria> findByNombreContainingIgnoreCase(String nombre);

    //4. Lista las categorias en orden alfabético
    List<Categoria> findAllByOrderByNombreAsc();

}
