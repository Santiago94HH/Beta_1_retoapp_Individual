package com.example.beta_1_retoapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.beta_1_retoapp.models.Registro;
import com.example.beta_1_retoapp.models.Reto;
import com.example.beta_1_retoapp.models.Usuario;

public class RegistroRequestDTO {

    private LocalDateTime fechaRegistro;
    private String observacion;
    private String estado;

//Relaciones mediante llaves primarias
    private UUID idUsuario;
    private UUID idReto;

//Constructor vacio (Deserializacion JSON)
    public RegistroRequestDTO(){

    }

    public RegistroRequestDTO(LocalDateTime fechaRegistro, String observacion, String estado, UUID idUsuario,
            UUID idReto) {
        this.fechaRegistro = fechaRegistro;
        this.observacion = observacion;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.idReto = idReto;
    }

//Mapeo a entidad Registro 
public Registro toEntity(){
    Registro registro = new Registro();
    registro.setFechaRegistro(this.fechaRegistro);
    registro.setObservacion(this.observacion);
    registro.setEstado(this.estado);
    return registro;
}

//Mapeo a entidad Registro a los objetos Usuario y Reto
public Registro toEntity(Usuario usuario, Reto reto){
    Registro registro = this.toEntity();
    registro.setUsuario(usuario);
    registro.setReto(reto);
    return registro;
}

//Getter y Setters

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

public UUID getIdUsuario() {
    return idUsuario;
}

public void setIdUsuario(UUID idUsuario) {
    this.idUsuario = idUsuario;
}

public UUID getIdReto() {
    return idReto;
}

public void setIdReto(UUID idReto) {
    this.idReto = idReto;
}


}
