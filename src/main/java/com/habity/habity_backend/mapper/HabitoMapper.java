package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.HabitoDTO;
import com.habity.habity_backend.entity.Habito;

public class HabitoMapper {

    public static HabitoDTO toDTO(Habito entity) {
        HabitoDTO dto = new HabitoDTO();
        dto.id = entity.getId();
        dto.nombre = entity.getNombre();
        dto.descripcion = entity.getDescripcion();
        dto.activo = entity.isActivo();
        dto.usuarioId = entity.getUsuario().getId();
        dto.tipoHabitoId = entity.getTipoHabito().getId();
        return dto;
    }

    public static Habito toEntity(HabitoDTO dto) {
        Habito entity = new Habito();
        entity.setId(dto.id);
        entity.setNombre(dto.nombre);
        entity.setDescripcion(dto.descripcion);
        entity.setActivo(dto.activo);
        return entity;
    }
}
