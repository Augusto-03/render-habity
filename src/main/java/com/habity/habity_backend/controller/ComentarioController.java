package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.ComentarioDTO;
import com.habity.habity_backend.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/publicacion/{id}")
    public List<ComentarioDTO> obtenerComentariosPorPublicacion(@PathVariable Long id) {
        return comentarioService.obtenerPorPublicacion(id);
    }

    @PostMapping
    public ComentarioDTO crearComentario(@RequestBody ComentarioDTO dto) {
        return comentarioService.crearComentario(dto);
    }
}
