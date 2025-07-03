package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.RecompensaDTO;
import com.habity.habity_backend.service.RecompensaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recompensas")
public class RecompensaController {

    @Autowired
    private RecompensaService recompensaService;

    @GetMapping("/usuario/{id}")
    public List<RecompensaDTO> obtenerPorUsuario(@PathVariable Long id) {
        return recompensaService.obtenerPorUsuario(id);
    }

    @PostMapping
    public RecompensaDTO crear(@RequestBody RecompensaDTO dto) {
        return recompensaService.crearRecompensa(dto);
    }
}
