package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.EstadisticaPersonalDTO;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.service.EstadisticaPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estadisticas")
public class EstadisticaPersonalController {

    @Autowired
    private EstadisticaPersonalService estadisticaService;

    @GetMapping("/me")
    public ResponseEntity<EstadisticaPersonalDTO> obtenerEstadisticaDelUsuarioAutenticado() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null || !(auth.getPrincipal() instanceof Usuario usuario)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        EstadisticaPersonalDTO estadistica = estadisticaService.obtenerPorUsuario(usuario.getId());
        return ResponseEntity.ok(estadistica);
    }

}
