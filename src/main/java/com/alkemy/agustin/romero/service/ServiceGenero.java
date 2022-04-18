package com.alkemy.agustin.romero.service;

import com.alkemy.agustin.romero.models.Genero;

import java.util.List;

public interface ServiceGenero {
    Genero buscarGenero(Long id);
    Boolean existeGenero(Long id);
    Genero agregarGenero(Genero nuevo);
    Boolean eliminarGenero(Long id);
    List<Genero> getGeneroList();

}
