package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.RecordatorioDTO;
import com.habity.habity_backend.entity.Recordatorio;

public class RecordatorioMapper {

    public static RecordatorioDTO toDTO(Recordatorio entity) {
        RecordatorioDTO dto = new RecordatorioDTO();
        dto.id = entity.getId();
        dto.hora = entity.getHora();
        dto.habitoId = entity.getHabito().getId();
        return dto;
    }

    public static Recordatorio toEntity(RecordatorioDTO dto) {
        Recordatorio entity = new Recordatorio();
        entity.setId(dto.id);
        entity.setHora(dto.hora);
        return entity;
    }
}
