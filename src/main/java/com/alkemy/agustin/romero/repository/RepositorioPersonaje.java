package com.alkemy.agustin.romero.repository;

import com.alkemy.agustin.romero.models.Personaje;

import java.util.List;

public interface RepositorioPersonaje {
    Personaje buscarPersonaje(Long id);
    void crearPersonaje(Personaje nuevo); //guarda un personaje nuevo
    void actualizarPersonaje(Personaje editado);
    void eliminarPersonaje(Long id);
    List<Personaje> getPersonajesList();
    List<Personaje> buscarPorNombre(String nombre);
    List<Personaje> buscarPorEdad(Integer edad);
    List<Personaje> buscarPeliculasDondeApareceElPersonaje();
}
