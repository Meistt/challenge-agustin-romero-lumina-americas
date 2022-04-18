package com.alkemy.agustin.romero.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {

    @Column(name = "id_genero")
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
