package com.habity.habity_backend.controller;

import com.habity.habity_backend.dto.NotificacionDTO;
import com.habity.habity_backend.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @GetMapping("/usuario/{id}")
    public List<NotificacionDTO> obtenerPorUsuario(@PathVariable Long id) {
        return notificacionService.obtenerPorUsuario(id);
    }

    @PostMapping
    public NotificacionDTO crear(@RequestBody NotificacionDTO dto) {
        return notificacionService.crearNotificacion(dto);
    }

    @PutMapping("/{id}/leer")
    public void marcarComoLeida(@PathVariable Long id) {
        notificacionService.marcarComoLeida(id);
    }
}
