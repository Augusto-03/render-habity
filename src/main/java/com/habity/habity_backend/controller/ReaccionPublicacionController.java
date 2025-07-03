package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.ReaccionPublicacionDTO;
import com.habity.habity_backend.service.ReaccionPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reacciones")
public class ReaccionPublicacionController {

    @Autowired
    private ReaccionPublicacionService reaccionService;

    @GetMapping("/publicacion/{id}")
    public List<ReaccionPublicacionDTO> obtenerPorPublicacion(@PathVariable Long id) {
        return reaccionService.obtenerPorPublicacion(id);
    }

    @PostMapping
    public ReaccionPublicacionDTO crear(@RequestBody ReaccionPublicacionDTO dto) {
        return reaccionService.crearReaccion(dto);
    }
}
