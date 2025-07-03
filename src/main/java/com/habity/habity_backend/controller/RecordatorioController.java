package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.RecordatorioDTO;
import com.habity.habity_backend.service.RecordatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recordatorios")
public class RecordatorioController {

    @Autowired
    private RecordatorioService recordatorioService;

    @GetMapping("/habito/{id}")
    public List<RecordatorioDTO> obtenerPorHabito(@PathVariable Long id) {
        return recordatorioService.obtenerPorHabito(id);
    }

    @PostMapping
    public RecordatorioDTO crear(@RequestBody RecordatorioDTO dto) {
        return recordatorioService.crearRecordatorio(dto);
    }
}
