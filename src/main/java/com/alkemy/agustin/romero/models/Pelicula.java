package com.alkemy.agustin.romero.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pelicula", nullable = false)
    private Integer idPelicula;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private Date fechaCreacion;

    @Column(name = "calificacion")
    private Integer calificacion;

    public Pelicula() {
    }

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
