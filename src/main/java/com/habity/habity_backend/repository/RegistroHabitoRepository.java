package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.RegistroHabito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroHabitoRepository extends JpaRepository<RegistroHabito, Long> {
    List<RegistroHabito> findByHabitoId(Long habitoId);
}
