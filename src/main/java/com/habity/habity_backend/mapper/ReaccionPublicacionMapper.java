package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.ReaccionPublicacionDTO;
import com.habity.habity_backend.entity.ReaccionPublicacion;

public class ReaccionPublicacionMapper {

    public static ReaccionPublicacionDTO toDTO(ReaccionPublicacion entity) {
        ReaccionPublicacionDTO dto = new ReaccionPublicacionDTO();
        dto.id = entity.getId();
        dto.tipo = entity.getTipo();
        dto.usuarioId = entity.getUsuario().getId();
        dto.publicacionId = entity.getPublicacion().getId();
        return dto;
    }

    public static ReaccionPublicacion toEntity(ReaccionPublicacionDTO dto) {
        ReaccionPublicacion entity = new ReaccionPublicacion();
        entity.setId(dto.id);
        entity.setTipo(dto.tipo);
        return entity;
    }
}
