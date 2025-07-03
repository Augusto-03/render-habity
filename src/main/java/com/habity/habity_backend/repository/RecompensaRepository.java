package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.Recompensa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecompensaRepository extends JpaRepository<Recompensa, Long> {
    List<Recompensa> findByUsuarioId(Long usuarioId);
}
