package com.habity.habity_backend.mapper;

import com.habity.habity_backend.dto.ComentarioDTO;
import com.habity.habity_backend.entity.Comentario;

public class ComentarioMapper {

    public static ComentarioDTO toDTO(Comentario comentario) {
        ComentarioDTO dto = new ComentarioDTO();
        dto.id = comentario.getId();
        dto.contenido = comentario.getContenido();
        dto.fecha = comentario.getFecha();
        dto.autorId = comentario.getAutor().getId();
        dto.publicacionId = comentario.getPublicacion().getId();
        return dto;
    }

    public static Comentario toEntity(ComentarioDTO dto) {
        Comentario comentario = new Comentario();
        comentario.setId(dto.id);
        comentario.setContenido(dto.contenido);
        comentario.setFecha(dto.fecha);
        return comentario;
    }
}
