package com.habity.habity_backend.dto;

public class HabitoDTO {
    public Long id;
    public String nombre;
    public String descripcion;
    public boolean activo;
    public Long usuarioId;
    public Long tipoHabitoId;
    private String tipoNombre;

    public String getTipoNombre() {
        return tipoNombre;
    }

    public void setTipoNombre(String tipoNombre) {
        this.tipoNombre = tipoNombre;
    }

}
