package com.habity.habity_backend.service;

import com.habity.habity_backend.dto.RecordatorioDTO;
import com.habity.habity_backend.entity.Habito;
import com.habity.habity_backend.entity.Recordatorio;
import com.habity.habity_backend.mapper.RecordatorioMapper;
import com.habity.habity_backend.repository.HabitoRepository;
import com.habity.habity_backend.repository.RecordatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordatorioService {

    @Autowired
    private RecordatorioRepository recordatorioRepository;

    @Autowired
    private HabitoRepository habitoRepository;

    public List<RecordatorioDTO> obtenerPorHabito(Long habitoId) {
        return recordatorioRepository.findByHabitoId(habitoId).stream()
                .map(RecordatorioMapper::toDTO)
                .collect(Collectors.toList());
    }

    public RecordatorioDTO crearRecordatorio(RecordatorioDTO dto) {
        Recordatorio entity = RecordatorioMapper.toEntity(dto);
        Habito habito = habitoRepository.findById(dto.habitoId).orElseThrow();
        entity.setHabito(habito);
        return RecordatorioMapper.toDTO(recordatorioRepository.save(entity));
    }
}
