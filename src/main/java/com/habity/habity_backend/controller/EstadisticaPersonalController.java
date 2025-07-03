package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.EstadisticaPersonalDTO;
import com.habity.habity_backend.service.EstadisticaPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estadisticas")
public class EstadisticaPersonalController {

    @Autowired
    private EstadisticaPersonalService estadisticaService;

    @GetMapping("/usuario/{id}")
    public EstadisticaPersonalDTO obtenerPorUsuario(@PathVariable Long id) {
        return estadisticaService.obtenerPorUsuario(id);
    }

    @PostMapping
    public EstadisticaPersonalDTO crearEstadistica(@RequestBody EstadisticaPersonalDTO dto) {
        return estadisticaService.crearEstadistica(dto);
    }
}
