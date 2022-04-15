package com.alkemy.agustin.romero.repository;

import com.alkemy.agustin.romero.models.Personaje;

public interface RepositorioPersonaje {
    Personaje buscarPersonaje(Long id);
    void crearPersonaje(Personaje nuevo); //guarda un personaje nuevo
    void actualizarPersonaje(Personaje editado);
    void eliminarPersonaje(Long id);
}
