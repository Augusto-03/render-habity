package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.RachaDTO;
import com.habity.habity_backend.entity.Racha;

public class RachaMapper {

    public static RachaDTO toDTO(Racha entity) {
        RachaDTO dto = new RachaDTO();
        dto.id = entity.getId();
        dto.diasConsecutivos = entity.getDiasConsecutivos();
        dto.fechaInicio = entity.getFechaInicio();
        dto.fechaUltimoRegistro = entity.getFechaUltimoRegistro();
        dto.habitoId = entity.getHabito().getId();
        return dto;
    }

    public static Racha toEntity(RachaDTO dto) {
        Racha entity = new Racha();
        entity.setId(dto.id);
        entity.setDiasConsecutivos(dto.diasConsecutivos);
        entity.setFechaInicio(dto.fechaInicio);
        entity.setFechaUltimoRegistro(dto.fechaUltimoRegistro);
        return entity;
    }
}
