package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.ReaccionPublicacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReaccionPublicacionRepository extends JpaRepository<ReaccionPublicacion, Long> {
    List<ReaccionPublicacion> findByPublicacionId(Long publicacionId);
}
