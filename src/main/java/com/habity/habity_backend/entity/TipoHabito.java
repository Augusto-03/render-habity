package com.habity.habity_backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipos_habito")
public class TipoHabito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "tipo")
    @JsonManagedReference("tipo-habito")
    private List<Habito> habitos;


    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Habito> getHabitos() { return habitos; }
    public void setHabitos(List<Habito> habitos) { this.habitos = habitos; }
}