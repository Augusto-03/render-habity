package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.RegistroHabitoDTO;
import com.habity.habity_backend.service.RegistroHabitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros")
public class RegistroHabitoController {

    @Autowired
    private RegistroHabitoService registroService;

    @GetMapping("/habito/{id}")
    public List<RegistroHabitoDTO> obtenerPorHabito(@PathVariable Long id) {
        return registroService.obtenerPorHabito(id);
    }

    @PostMapping
    public RegistroHabitoDTO crearRegistro(@RequestBody RegistroHabitoDTO dto) {
        return registroService.crearRegistro(dto);
    }
}
