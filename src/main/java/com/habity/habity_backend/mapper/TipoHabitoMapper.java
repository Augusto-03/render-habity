package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.TipoHabitoDTO;
import com.habity.habity_backend.entity.TipoHabito;

public class TipoHabitoMapper {

    public static TipoHabitoDTO toDTO(TipoHabito entity) {
        TipoHabitoDTO dto = new TipoHabitoDTO();
        dto.id = entity.getId();
        dto.nombre = entity.getNombre();
        return dto;
    }

    public static TipoHabito toEntity(TipoHabitoDTO dto) {
        TipoHabito entity = new TipoHabito();
        entity.setId(dto.id);
        entity.setNombre(dto.nombre);
        return entity;
    }
}
