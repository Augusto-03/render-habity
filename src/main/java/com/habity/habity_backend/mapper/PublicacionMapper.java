package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.PublicacionDTO;
import com.habity.habity_backend.entity.Publicacion;

public class PublicacionMapper {

    public static PublicacionDTO toDTO(Publicacion entity) {
        PublicacionDTO dto = new PublicacionDTO();
        dto.id = entity.getId();
        dto.contenido = entity.getContenido();
        dto.fecha = entity.getFecha();
        dto.usuarioId = entity.getUsuario().getId();
        return dto;
    }

    public static Publicacion toEntity(PublicacionDTO dto) {
        Publicacion entity = new Publicacion();
        entity.setId(dto.id);
        entity.setContenido(dto.contenido);
        entity.setFecha(dto.fecha);
        return entity;
    }
}
