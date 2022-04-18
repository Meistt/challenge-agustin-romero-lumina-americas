package com.alkemy.agustin.romero.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Column(name = "id_pelicula")
    private Integer idPelicula;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private Date fechaCreacion;

    @Column(name = "calificacion")
    private Integer calificacion;

    public Pelicula(Integer idPelicula, String titulo, Date fechaCreacion, Integer calificacion){

    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

}
