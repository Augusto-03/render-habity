package com.habity.habity_backend.dto;

import java.time.LocalDateTime;

public class NotificacionDTO {
    public Long id;
    public String mensaje;
    public boolean leida;
    public LocalDateTime fecha;
    public Long usuarioId;
}
