package com.habity.habity_backend.dto;

import java.time.LocalDate;

public class RachaDTO {
    public Long id;
    public int diasConsecutivos;
    public LocalDate fechaInicio;
    public LocalDate fechaUltimoRegistro;
    public Long habitoId;

    public int getDiasConsecutivos() {
        return diasConsecutivos;
    }

    public void setDiasConsecutivos(int diasConsecutivos) {
        this.diasConsecutivos = diasConsecutivos;
    }

    public LocalDate getFechaUltimoRegistro() {
        return fechaUltimoRegistro;
    }

    public void setFechaUltimoRegistro(LocalDate fechaUltimoRegistro) {
        this.fechaUltimoRegistro = fechaUltimoRegistro;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Long getHabitoId() {
        return habitoId;
    }

    public void setHabitoId(Long habitoId) {
        this.habitoId = habitoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}