package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.ReaccionPublicacionDTO;
import com.habity.habity_backend.entity.Publicacion;
import com.habity.habity_backend.entity.ReaccionPublicacion;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.mapper.ReaccionPublicacionMapper;
import com.habity.habity_backend.repository.PublicacionRepository;
import com.habity.habity_backend.repository.ReaccionPublicacionRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReaccionPublicacionService {

    @Autowired
    private ReaccionPublicacionRepository reaccionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PublicacionRepository publicacionRepository;

    public List<ReaccionPublicacionDTO> obtenerPorPublicacion(Long publicacionId) {
        return reaccionRepository.findByPublicacionId(publicacionId).stream()
                .map(ReaccionPublicacionMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ReaccionPublicacionDTO crearReaccion(ReaccionPublicacionDTO dto) {
        ReaccionPublicacion entity = ReaccionPublicacionMapper.toEntity(dto);
        Usuario usuario = usuarioRepository.findById(dto.usuarioId).orElseThrow();
        Publicacion publicacion = publicacionRepository.findById(dto.publicacionId).orElseThrow();

        entity.setUsuario(usuario);
        entity.setPublicacion(publicacion);

        return ReaccionPublicacionMapper.toDTO(reaccionRepository.save(entity));
    }
}
