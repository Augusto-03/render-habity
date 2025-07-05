package com.habity.habity_backend.repository;

import com.habity.habity_backend.entity.Habito;
import com.habity.habity_backend.entity.TipoHabito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoHabitoRepository extends JpaRepository<TipoHabito, Long> {
    @Query("SELECT DISTINCT r.habito FROM RegistroHabito r WHERE r.habito.usuario.email = :email")
    List<Habito> findHabitosConRegistroByEmail(@Param("email") String email);

}
