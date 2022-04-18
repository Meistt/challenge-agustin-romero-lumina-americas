package com.alkemy.agustin.romero.models;

import javax.persistence.*;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_genero", nullable = false)
    private Long idGenero;

    @Column(name = "nombre")
    private String nombre;

    public Genero(){

    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
