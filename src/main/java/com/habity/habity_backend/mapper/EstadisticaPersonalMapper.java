package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.EstadisticaPersonalDTO;
import com.habity.habity_backend.entity.EstadisticaPersonal;

public class EstadisticaPersonalMapper {

    public static EstadisticaPersonalDTO toDTO(EstadisticaPersonal entity) {
        EstadisticaPersonalDTO dto = new EstadisticaPersonalDTO();
        dto.id = entity.getId();
        dto.totalHabitosCumplidos = entity.getTotalHabitosCumplidos();
        dto.totalDiasActivos = entity.getTotalDiasActivos();
        dto.rachaActual = entity.getRachaActual();
        dto.usuarioId = entity.getUsuario().getId();
        return dto;
    }

    public static EstadisticaPersonal toEntity(EstadisticaPersonalDTO dto) {
        EstadisticaPersonal entity = new EstadisticaPersonal();
        entity.setId(dto.id);
        entity.setTotalHabitosCumplidos(dto.totalHabitosCumplidos);
        entity.setTotalDiasActivos(dto.totalDiasActivos);
        entity.setRachaActual(dto.rachaActual);
        return entity;
    }
}
