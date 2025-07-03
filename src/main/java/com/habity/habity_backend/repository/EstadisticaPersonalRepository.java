package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.EstadisticaPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EstadisticaPersonalRepository extends JpaRepository<EstadisticaPersonal, Long> {
    Optional<EstadisticaPersonal> findByUsuarioId(Long usuarioId);
}
