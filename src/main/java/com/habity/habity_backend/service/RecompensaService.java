package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.RecompensaDTO;
import com.habity.habity_backend.entity.Recompensa;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.mapper.RecompensaMapper;
import com.habity.habity_backend.repository.RecompensaRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecompensaService {

    @Autowired
    private RecompensaRepository recompensaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<RecompensaDTO> obtenerPorUsuario(Long usuarioId) {
        return recompensaRepository.findByUsuarioId(usuarioId).stream()
                .map(RecompensaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public RecompensaDTO crearRecompensa(RecompensaDTO dto) {
        Recompensa entity = RecompensaMapper.toEntity(dto);
        Usuario usuario = usuarioRepository.findById(dto.usuarioId).orElseThrow();
        entity.setUsuario(usuario);
        return RecompensaMapper.toDTO(recompensaRepository.save(entity));
    }
}
