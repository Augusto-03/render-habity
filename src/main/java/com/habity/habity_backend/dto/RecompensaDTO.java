package com.habity.habity_backend.dto;

import java.time.LocalDateTime;

public class RecompensaDTO {
    public Long id;
    public String titulo;
    public String descripcion;
    public LocalDateTime fechaOtorgada;
    public Long usuarioId;
}