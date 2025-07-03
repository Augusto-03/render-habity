package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.NotificacionDTO;
import com.habity.habity_backend.entity.Notificacion;

public class NotificacionMapper {

    public static NotificacionDTO toDTO(Notificacion entity) {
        NotificacionDTO dto = new NotificacionDTO();
        dto.id = entity.getId();
        dto.mensaje = entity.getMensaje();
        dto.leida = entity.isLeida();
        dto.fecha = entity.getFecha();
        dto.usuarioId = entity.getUsuario().getId();
        return dto;
    }

    public static Notificacion toEntity(NotificacionDTO dto) {
        Notificacion entity = new Notificacion();
        entity.setId(dto.id);
        entity.setMensaje(dto.mensaje);
        entity.setLeida(dto.leida);
        entity.setFecha(dto.fecha);
        return entity;
    }
}
