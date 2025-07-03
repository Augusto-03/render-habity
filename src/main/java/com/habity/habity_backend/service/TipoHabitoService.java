package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.TipoHabitoDTO;
import com.habity.habity_backend.entity.TipoHabito;
import com.habity.habity_backend.mapper.TipoHabitoMapper;
import com.habity.habity_backend.repository.TipoHabitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoHabitoService {

    @Autowired
    private TipoHabitoRepository tipoHabitoRepository;

    public List<TipoHabitoDTO> obtenerTodos() {
        return tipoHabitoRepository.findAll().stream()
                .map(TipoHabitoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public TipoHabitoDTO crearTipoHabito(TipoHabitoDTO dto) {
        TipoHabito entity = TipoHabitoMapper.toEntity(dto);
        return TipoHabitoMapper.toDTO(tipoHabitoRepository.save(entity));
    }
}
