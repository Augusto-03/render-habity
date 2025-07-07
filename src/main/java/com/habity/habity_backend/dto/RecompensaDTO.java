package com.habity.habity_backend.dto;

import java.time.LocalDateTime;

public class RecompensaDTO {
    public Long id;
    public String titulo;
    public String descripcion;
    public LocalDateTime fechaOtorgada;
    public Long usuarioId;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaOtorgada() {
        return fechaOtorgada;
    }

    public void setFechaOtorgada(LocalDateTime fechaOtorgada) {
        this.fechaOtorgada = fechaOtorgada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}