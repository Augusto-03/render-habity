package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.EstadisticaPersonalDTO;
import com.habity.habity_backend.entity.EstadisticaPersonal;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.mapper.EstadisticaPersonalMapper;
import com.habity.habity_backend.repository.EstadisticaPersonalRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadisticaPersonalService {

    @Autowired
    private EstadisticaPersonalRepository estadisticaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public EstadisticaPersonalDTO obtenerPorUsuario(Long usuarioId) {
        Optional<EstadisticaPersonal> estadistica = estadisticaRepository.findByUsuarioId(usuarioId);
        return estadistica.map(EstadisticaPersonalMapper::toDTO).orElse(null);
    }

    public EstadisticaPersonalDTO crearEstadistica(EstadisticaPersonalDTO dto) {
        EstadisticaPersonal entity = EstadisticaPersonalMapper.toEntity(dto);
        Usuario usuario = usuarioRepository.findById(dto.usuarioId).orElseThrow();
        entity.setUsuario(usuario);
        return EstadisticaPersonalMapper.toDTO(estadisticaRepository.save(entity));
    }
}
