package com.habity.habity_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estadisticas_personales")
public class EstadisticaPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalHabitosCumplidos;
    private int totalDiasActivos;
    private int rachaActual;

    @OneToOne
    private Usuario usuario;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }
    public int getTotalHabitosCumplidos() { return totalHabitosCumplidos; }
    public void setTotalHabitosCumplidos(int totalHabitosCumplidos) { this.totalHabitosCumplidos = totalHabitosCumplidos; }
    public int getTotalDiasActivos() { return totalDiasActivos; }
    public void setTotalDiasActivos(int totalDiasActivos) { this.totalDiasActivos = totalDiasActivos; }
    public int getRachaActual() { return rachaActual; }
    public void setRachaActual(int rachaActual) { this.rachaActual = rachaActual; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}