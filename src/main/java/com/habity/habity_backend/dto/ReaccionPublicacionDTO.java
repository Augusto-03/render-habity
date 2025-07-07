package com.habity.habity_backend.dto;

public class ReaccionPublicacionDTO {
    public Long id;
    public boolean esLike;
    public Long autorId;
    public Long publicacionId;
    public Long usuarioId;
    public String tipo;

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    public boolean isEsLike() {
        return esLike;
    }

    public void setEsLike(boolean esLike) {
        this.esLike = esLike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPublicacionId() {
        return publicacionId;
    }

    public void setPublicacionId(Long publicacionId) {
        this.publicacionId = publicacionId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
