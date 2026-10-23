package com.example.beta_1_retoapp.services;

import java.util.List;
import java.util.UUID;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.example.beta_1_retoapp.models.Empresa;

@Service 
public class ServicioEmpresa implements IEmpresaServicio {

    @Override
    public Empresa crearEmpresa1(Empresa empresa) {
        // Implementación del método para crear una empresa
        return null;
    }

    @Override
    public List<Empresa> obtenerEmpresas() {
        // Implementación del método para obtener todas las empresas
        return null;
    }

    public Empresa Guardar(Empresa datos) {
        // Implementación del método para guardar una empresa
        return null;
    }

    @Override
    public Empresa buscarEmpresaPorId(String id) {
        // Implementación del método para buscar una empresa por su ID
        return null;
    }

    @Override
    public Empresa actualizarEmpresa(String id, Empresa empresa) {
        // Implementación del método para actualizar una empresa existente
        return null;
    }

    public Empresa eliminarEmpre(String id) {
        // Implementación del método para eliminar una empresa por su ID
        return null;
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearEmpresa'");
    }

    public Empresa actualizarEmpresa1(String id, Empresa empresa) {

        
        throw new UnsupportedOperationException("Unimplemented method 'actualizarEmpresa'");
    }

    public @Nullable Object modificar(UUID id, Empresa datos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public Empresa eliminarEmpresa(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarEmpresa'");
    }
    

}
