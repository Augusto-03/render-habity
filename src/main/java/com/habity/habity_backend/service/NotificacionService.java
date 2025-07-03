package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.NotificacionDTO;
import com.habity.habity_backend.entity.Notificacion;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.mapper.NotificacionMapper;
import com.habity.habity_backend.repository.NotificacionRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<NotificacionDTO> obtenerPorUsuario(Long usuarioId) {
        return notificacionRepository.findByUsuarioId(usuarioId).stream()
                .map(NotificacionMapper::toDTO)
                .collect(Collectors.toList());
    }

    public NotificacionDTO crearNotificacion(NotificacionDTO dto) {
        Notificacion entity = NotificacionMapper.toEntity(dto);
        Usuario usuario = usuarioRepository.findById(dto.usuarioId).orElseThrow();
        entity.setUsuario(usuario);
        return NotificacionMapper.toDTO(notificacionRepository.save(entity));
    }

    public void marcarComoLeida(Long id) {
        Notificacion n = notificacionRepository.findById(id).orElseThrow();
        n.setLeida(true);
        notificacionRepository.save(n);
    }
}
