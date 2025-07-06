package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.RegistroHabito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RegistroHabitoRepository extends JpaRepository<RegistroHabito, Long> {

    List<RegistroHabito> findByHabitoId(Long habitoId);
    List<RegistroHabito> findByUsuarioIdAndCumplidoTrue(Long usuarioId);

    boolean existsByHabitoIdAndFecha(Long habitoId, LocalDate fecha);

    void deleteByHabitoIdAndFecha(Long habitoId, LocalDate fecha);
}
