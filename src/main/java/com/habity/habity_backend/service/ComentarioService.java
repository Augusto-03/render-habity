package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.ComentarioDTO;
import com.habity.habity_backend.entity.Comentario;
import com.habity.habity_backend.entity.Publicacion;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.mapper.ComentarioMapper;
import com.habity.habity_backend.repository.ComentarioRepository;
import com.habity.habity_backend.repository.PublicacionRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PublicacionRepository publicacionRepository;

    public List<ComentarioDTO> obtenerPorPublicacion(Long publicacionId) {
        return comentarioRepository.findByPublicacionId(publicacionId).stream()
                .map(ComentarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ComentarioDTO crearComentario(ComentarioDTO dto) {
        Comentario comentario = ComentarioMapper.toEntity(dto);
        Usuario autor = usuarioRepository.findById(dto.autorId).orElseThrow();
        Publicacion publicacion = publicacionRepository.findById(dto.publicacionId).orElseThrow();

        comentario.setAutor(autor);
        comentario.setPublicacion(publicacion);

        return ComentarioMapper.toDTO(comentarioRepository.save(comentario));
    }
}
