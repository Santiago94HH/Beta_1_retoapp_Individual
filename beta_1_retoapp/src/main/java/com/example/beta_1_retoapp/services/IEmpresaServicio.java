package com.example.beta_1_retoapp.services;

import java.util.List;

import com.example.beta_1_retoapp.models.Empresa;

public interface IEmpresaServicio{

    Empresa crearEmpresa(Empresa empresa);
    List<Empresa> obtenerEmpresas();
    Empresa Guardar(Empresa datos);
    Empresa buscarEmpresaPorId(String id);
    Empresa actualizarEmpresa(String id, Empresa empresa);
    Empresa eliminarEmpresa(String id);
    Empresa crearEmpresa1(Empresa empresa);
    Empresa actualizarEmpresa1(String id, Empresa empresa);
}
