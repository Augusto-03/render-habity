package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.UsuarioDTO;
import com.habity.habity_backend.entity.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.id = entity.getId();
        dto.nombre = entity.getNombre();
        dto.email = entity.getEmail();
        dto.puntos = entity.getPuntos();
        return dto;
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        Usuario entity = new Usuario();
        entity.setId(dto.id);
        entity.setNombre(dto.nombre);
        entity.setEmail(dto.email);
        entity.setPuntos(dto.puntos);
        return entity;
    }
}
