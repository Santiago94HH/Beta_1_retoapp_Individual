package com.example.beta_1_retoapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.beta_1_retoapp.models.Registro;

public class RegistroResponseDTO {

private UUID id;
private LocalDateTime fechaRegistro;
private String observacion;
private String estado;

//IDs para cortar recursion infinita
private UUID usuarioId;
private UUID retoId;

//Constructor vacio
public RegistroResponseDTO(){

}

//Constructor con parametros
public RegistroResponseDTO(UUID id, LocalDateTime fechaRegistro, String observacion, String estado, UUID usuarioId,
        UUID retoId) {
    this.id = id;
    this.fechaRegistro = fechaRegistro;
    this.observacion = observacion;
    this.estado = estado;
    this.usuarioId = usuarioId;
    this.retoId = retoId;
}

//Metodo estatico para mapear la Entidad Registro al DTO de respuesta
public static RegistroResponseDTO fromEntity (Registro registro){
    if (registro == null){
        return null;
    }
    UUID usuarioId = (registro.getUsuario() != null) ? registro.getUsuario().getId() : null;
    UUID retoId = (registro.getReto() != null) ? registro.getReto().getId() : null;

    return new RegistroResponseDTO(
        registro.getId(),
        registro.getFechaRegistro(),
        registro.getObservacion(),
        registro.getEstado(),
        usuarioId,
        retoId
    );

}

//Getters y Setters

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public LocalDateTime getFechaRegistro() {
    return fechaRegistro;
}

public void setFechaRegistro(LocalDateTime fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
}

public String getObservacion() {
    return observacion;
}

public void setObservacion(String observacion) {
    this.observacion = observacion;
}

public String getEstado() {
    return estado;
}

public void setEstado(String estado) {
    this.estado = estado;
}

public UUID getUsuarioId() {
    return usuarioId;
}

public void setUsuarioId(UUID usuarioId) {
    this.usuarioId = usuarioId;
}

public UUID getRetoId() {
    return retoId;
}

public void setRetoId(UUID retoId) {
    this.retoId = retoId;
}

}
