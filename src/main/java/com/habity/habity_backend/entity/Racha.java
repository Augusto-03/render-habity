package com.habity.habity_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "rachas")
public class Racha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int diasConsecutivos;
    private LocalDate fechaInicio;
    private LocalDate fechaUltimoRegistro;

    @OneToOne
    private Habito habito;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }
    public int getDiasConsecutivos() { return diasConsecutivos; }
    public void setDiasConsecutivos(int diasConsecutivos) { this.diasConsecutivos = diasConsecutivos; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    public LocalDate getFechaUltimoRegistro() { return fechaUltimoRegistro; }
    public void setFechaUltimoRegistro(LocalDate fechaUltimoRegistro) { this.fechaUltimoRegistro = fechaUltimoRegistro; }
    public Habito getHabito() { return habito; }
    public void setHabito(Habito habito) { this.habito = habito; }
}
