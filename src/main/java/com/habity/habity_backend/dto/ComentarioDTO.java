package com.habity.habity_backend.dto;

import java.time.LocalDateTime;

public class ComentarioDTO {
    public Long id;
    public String contenido;
    public LocalDateTime fecha;
    public Long autorId;
    public Long publicacionId;
}
