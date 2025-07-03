package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.ReaccionPublicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReaccionPublicacionRepository extends JpaRepository<ReaccionPublicacion, Long> {

    // ✅ Buscar si un usuario ya reaccionó a una publicación
    Optional<ReaccionPublicacion> findByUsuarioIdAndPublicacionId(Long usuarioId, Long publicacionId);

    // ✅ Contar Likes
    Long countByPublicacionIdAndEsLikeTrue(Long publicacionId);

    // ✅ Contar Dislikes
    Long countByPublicacionIdAndEsLikeFalse(Long publicacionId);

    // (opcional) Obtener todas las reacciones de una publicación
    List<ReaccionPublicacion> findByPublicacionId(Long publicacionId);
}
