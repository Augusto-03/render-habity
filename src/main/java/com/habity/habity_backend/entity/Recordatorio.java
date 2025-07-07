package com.habity.habity_backend.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "recordatorios")
public class Recordatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime hora;
    private String mensaje;

    @ManyToOne
    private Habito habito;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }
    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    public Habito getHabito() { return habito; }
    public void setHabito(Habito habito) { this.habito = habito; }
}
