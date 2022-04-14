package com.alkemy.agustin.romero.service;

import com.alkemy.agustin.romero.models.Personaje;

public interface ServicePersonaje {
    Boolean nuevoPersonaje(Long id, String nombre, Integer edad, Double peso, String historia);
    void editarPersonaje(Long id, String nombre, Integer edad, Double peso, String historia);
    Boolean eliminarPersonaje(Long id);
    Personaje buscarPersonaje(Long id);
    Boolean existe(Long id);
}
