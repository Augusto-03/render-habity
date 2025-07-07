package com.habity.habity_backend.dto;

public class EstadisticaPersonalDTO {
    public Long id;
    public int totalHabitosCumplidos;
    public int totalDiasActivos;
    public int rachaActual;
    public Long usuarioId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRachaActual() {
        return rachaActual;
    }

    public void setRachaActual(int rachaActual) {
        this.rachaActual = rachaActual;
    }

    public int getTotalDiasActivos() {
        return totalDiasActivos;
    }

    public void setTotalDiasActivos(int totalDiasActivos) {
        this.totalDiasActivos = totalDiasActivos;
    }

    public int getTotalHabitosCumplidos() {
        return totalHabitosCumplidos;
    }

    public void setTotalHabitosCumplidos(int totalHabitosCumplidos) {
        this.totalHabitosCumplidos = totalHabitosCumplidos;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}