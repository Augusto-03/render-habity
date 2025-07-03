package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.RachaDTO;
import com.habity.habity_backend.service.RachaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rachas")
public class RachaController {

    @Autowired
    private RachaService rachaService;

    @GetMapping("/habito/{id}")
    public List<RachaDTO> obtenerPorHabito(@PathVariable Long id) {
        return rachaService.obtenerPorHabito(id);
    }

    @PostMapping
    public RachaDTO crearRacha(@RequestBody RachaDTO dto) {
        return rachaService.crearRacha(dto);
    }
}
