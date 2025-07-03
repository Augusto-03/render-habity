package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.TipoHabitoDTO;
import com.habity.habity_backend.service.TipoHabitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-habito")
public class TipoHabitoController {

    @Autowired
    private TipoHabitoService tipoHabitoService;

    @GetMapping
    public List<TipoHabitoDTO> obtenerTodos() {
        return tipoHabitoService.obtenerTodos();
    }

    @PostMapping
    public TipoHabitoDTO crear(@RequestBody TipoHabitoDTO dto) {
        return tipoHabitoService.crearTipoHabito(dto);
    }
}
