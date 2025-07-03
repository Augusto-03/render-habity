package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.RecompensaDTO;
import com.habity.habity_backend.entity.Recompensa;

public class RecompensaMapper {

    public static RecompensaDTO toDTO(Recompensa entity) {
        RecompensaDTO dto = new RecompensaDTO();
        dto.id = entity.getId();
        dto.descripcion = entity.getDescripcion();
        dto.usuarioId = entity.getUsuario().getId();
        return dto;
    }

    public static Recompensa toEntity(RecompensaDTO dto) {
        Recompensa entity = new Recompensa();
        entity.setId(dto.id);
        entity.setDescripcion(dto.descripcion);
        return entity;
    }
}
