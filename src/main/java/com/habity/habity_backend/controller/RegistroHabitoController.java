package com.habity.habity_backend.controller;

import com.habity.habity_backend.config.JwtUtil;
import com.habity.habity_backend.dto.RegistroHabitoDTO;
import com.habity.habity_backend.service.RegistroHabitoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registro-habitos")
public class RegistroHabitoController {

    @Autowired
    private RegistroHabitoService registroHabitoService;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/habito/{habitoId}")
    public List<RegistroHabitoDTO> obtenerPorHabito(@PathVariable Long habitoId) {
        return registroHabitoService.obtenerPorHabito(habitoId);
    }

    @PostMapping
    public RegistroHabitoDTO crearRegistro(@RequestBody RegistroHabitoDTO dto) {
        return registroHabitoService.crearRegistro(dto);
    }

    @GetMapping("/usuario")
    public List<RegistroHabitoDTO> obtenerRegistrosDelUsuario(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String token = authHeader != null && authHeader.startsWith("Bearer ")
                ? authHeader.substring(7)
                : "";
        return registroHabitoService.obtenerPorUsuario(token);
    }
}
