package com.example.beta_1_retoapp.services;

import java.util.List;
import java.util.UUID;

import com.example.beta_1_retoapp.dtos.EmpresaRequestDTO;
import com.example.beta_1_retoapp.dtos.EmpresaResponseDTO;


public interface IEmpresaServicio{

    EmpresaResponseDTO crear(EmpresaRequestDTO requestDTO);
    List<EmpresaResponseDTO> listar();
    EmpresaResponseDTO buscarPorId(UUID id);
    EmpresaResponseDTO actualizar (UUID id, EmpresaRequestDTO requestDTO);
    void eliminar (UUID id);

}
