package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.Racha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RachaRepository extends JpaRepository<Racha, Long> {
    List<Racha> findByHabitoId(Long habitoId);
}
