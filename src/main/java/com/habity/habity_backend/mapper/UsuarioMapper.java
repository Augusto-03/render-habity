package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.UsuarioDTO;
import com.habity.habity_backend.entity.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        Usuario entity = new Usuario();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}

