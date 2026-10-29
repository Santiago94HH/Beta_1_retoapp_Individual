package com.example.beta_1_retoapp.services;

import org.springframework.stereotype.Service;

import com.example.beta_1_retoapp.dtos.EmpresaRequestDTO;
import com.example.beta_1_retoapp.dtos.EmpresaResponseDTO;
import com.example.beta_1_retoapp.repository.IRepositorioEmpresa;

@Service 
public class EmpresaServiciolmpl implements IEmpresaServicio {

    private final IRepositorioEmpresa IRepositorioEmpresa;

    public EmpresaServiciolmpl (IRepositorioEmpresa empresaRepository, IRepositorioEmpresa IRepositorioEmpresa){
        this.IRepositorioEmpresa = IRepositorioEmpresa;
    }

    public EmpresaResponseDTO crear (EmpresaRequestDTO requestDTO){
        validarCamposObligatoriosYFormato(requestDTO);
        
    }

}
