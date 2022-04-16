package com.alkemy.agustin.romero.service;

import com.alkemy.agustin.romero.models.Personaje;

import java.util.List;

public interface ServicePersonaje {
    Boolean nuevoPersonaje(Long id, String nombre, Integer edad, Double peso, String historia);
    String editarPersonaje(Long id, String nombre, Integer edad, Double peso, String historia);
    Boolean eliminarPersonaje(Long id);
    Personaje buscarPersonaje(Long id);
    Boolean existe(Long id);

    List<Personaje> buscarPorNombre(String nombre);
    List<Personaje> buscarPorEdad(Integer edad);
    List<Personaje> buscarCoincidenciasPorPeliculas(Long id);
    List<Personaje> getPersonajesList();
    List<Personaje> personajeDetalle(Long id);
}
