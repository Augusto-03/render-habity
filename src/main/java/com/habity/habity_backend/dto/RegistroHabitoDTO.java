package com.habity.habity_backend.dto;

import java.time.LocalDate;

public class RegistroHabitoDTO {
    public Long id;
    public LocalDate fecha;
    public boolean cumplido;
    public Long habitoId;

    public boolean isCumplido() {
        return cumplido;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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