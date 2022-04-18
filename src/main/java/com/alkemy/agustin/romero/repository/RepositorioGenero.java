package com.alkemy.agustin.romero.repository;

import com.alkemy.agustin.romero.models.Genero;

import java.util.List;

public interface RepositorioGenero {
    Genero buscarGenero(Long id);
    void agregarGenero(Genero nuevo);
    void eliminarGenero(Long id);
    List<Genero> getGeneroList();
}
