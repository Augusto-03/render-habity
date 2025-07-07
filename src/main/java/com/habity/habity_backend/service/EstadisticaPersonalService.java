package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.EstadisticaPersonalDTO;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.entity.RegistroHabito;
import com.habity.habity_backend.repository.RegistroHabitoRepository;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EstadisticaPersonalService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RegistroHabitoRepository registroHabitoRepository;

    public EstadisticaPersonalDTO obtenerPorUsuario(Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow();

        List<RegistroHabito> registros = registroHabitoRepository.findByUsuarioIdAndCumplidoTrue(usuarioId);
        int totalHabitosCumplidos = registros.size();

        Set<LocalDate> diasActivos = registros.stream()
                .map(RegistroHabito::getFecha)
                .collect(Collectors.toSet());

        int totalDiasActivos = diasActivos.size();

        int rachaActual = calcularRacha(diasActivos);

        EstadisticaPersonalDTO dto = new EstadisticaPersonalDTO();
        dto.usuarioId = usuarioId;
        dto.totalHabitosCumplidos = totalHabitosCumplidos;
        dto.totalDiasActivos = totalDiasActivos;
        dto.rachaActual = rachaActual;

        return dto;
    }

    private int calcularRacha(Set<LocalDate> diasActivos) {
        LocalDate hoy = LocalDate.now();
        int racha = 0;

        while (diasActivos.contains(hoy.minusDays(racha))) {
            racha++;
        }

        return racha;
    }
}

