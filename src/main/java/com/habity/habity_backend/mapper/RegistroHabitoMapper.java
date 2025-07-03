package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.RegistroHabitoDTO;
import com.habity.habity_backend.entity.RegistroHabito;

public class RegistroHabitoMapper {

    public static RegistroHabitoDTO toDTO(RegistroHabito entity) {
        RegistroHabitoDTO dto = new RegistroHabitoDTO();
        dto.id = entity.getId();
        dto.fecha = entity.getFecha();
        dto.completado = entity.isCompletado();
        dto.habitoId = entity.getHabito().getId();
        return dto;
    }

    public static RegistroHabito toEntity(RegistroHabitoDTO dto) {
        RegistroHabito entity = new RegistroHabito();
        entity.setId(dto.id);
        entity.setFecha(dto.fecha);
        entity.setCompletado(dto.completado);
        return entity;
    }
}
