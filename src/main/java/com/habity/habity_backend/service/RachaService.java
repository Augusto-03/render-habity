package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.RachaDTO;
import com.habity.habity_backend.entity.Habito;
import com.habity.habity_backend.entity.Racha;
import com.habity.habity_backend.mapper.RachaMapper;
import com.habity.habity_backend.repository.HabitoRepository;
import com.habity.habity_backend.repository.RachaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RachaService {

    @Autowired
    private RachaRepository rachaRepository;

    @Autowired
    private HabitoRepository habitoRepository;

    public List<RachaDTO> obtenerPorHabito(Long habitoId) {
        return rachaRepository.findByHabitoId(habitoId).stream()
                .map(RachaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public RachaDTO crearRacha(RachaDTO dto) {
        Racha entity = RachaMapper.toEntity(dto);
        Habito habito = habitoRepository.findById(dto.habitoId).orElseThrow();
        entity.setHabito(habito);
        return RachaMapper.toDTO(rachaRepository.save(entity));
    }
}
