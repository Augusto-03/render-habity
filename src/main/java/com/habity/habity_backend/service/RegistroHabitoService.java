package com.habity.habity_backend.service;

import com.habity.habity_backend.config.JwtUtil;
import com.habity.habity_backend.dto.HabitoDTO;
import com.habity.habity_backend.dto.RegistroHabitoDTO;
import com.habity.habity_backend.entity.Habito;
import com.habity.habity_backend.entity.RegistroHabito;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.mapper.HabitoMapper;
import com.habity.habity_backend.mapper.RegistroHabitoMapper;
import com.habity.habity_backend.repository.HabitoRepository;
import com.habity.habity_backend.repository.RegistroHabitoRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistroHabitoService {

    @Autowired
    private RegistroHabitoRepository registroRepository;

    @Autowired
    private HabitoRepository habitoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public List<RegistroHabitoDTO> obtenerPorHabito(Long habitoId) {
        return registroRepository.findByHabitoId(habitoId).stream()
                .map(RegistroHabitoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public RegistroHabitoDTO crearRegistro(RegistroHabitoDTO dto, String token) {
        String email = jwtUtil.extractUsername(token);
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow();

        RegistroHabito entity = RegistroHabitoMapper.toEntity(dto);
        entity.setUsuario(usuario);

        Habito habito = habitoRepository.findById(dto.habitoId).orElseThrow();
        entity.setHabito(habito);

        return RegistroHabitoMapper.toDTO(registroRepository.save(entity));
    }

    public List<RegistroHabitoDTO> obtenerPorUsuario(String token) {
        String email = jwtUtil.extractUsername(token);
        List<Habito> habitos = habitoRepository.findByUsuarioEmail(email);

        return habitos.stream()
                .flatMap(h -> registroRepository.findByHabitoId(h.getId()).stream())
                .map(RegistroHabitoMapper::toDTO)
                .collect(Collectors.toList());
    }
}

