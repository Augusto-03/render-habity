package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {
    List<Recordatorio> findByHabitoId(Long habitoId);
}
