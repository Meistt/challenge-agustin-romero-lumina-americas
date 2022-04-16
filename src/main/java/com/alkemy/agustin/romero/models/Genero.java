package com.alkemy.agustin.romero.models;

public class Genero {
    private Long idGenero;
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
