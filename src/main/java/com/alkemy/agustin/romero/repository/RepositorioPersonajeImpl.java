package com.alkemy.agustin.romero.repository;

import com.alkemy.agustin.romero.models.Personaje;

import java.util.List;

public class RepositorioPersonajeImpl implements RepositorioPersonaje{

    @Override
    public Personaje buscarPersonaje(Long id) {
        return null;
    }

    @Override
    public void crearPersonaje(Personaje nuevo) {

    }

    @Override
    public void actualizarPersonaje(Personaje editado) {

    }

    @Override
    public void eliminarPersonaje(Long id) {

    }

    @Override
    public List<Personaje> getPersonajesList() {
        return null;
    }

    @Override
    public List<Personaje> buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public List<Personaje> buscarPorEdad(Integer edad) {
        return null;
    }

    @Override
    public List<Personaje> buscarPeliculasDondeApareceElPersonaje() {
        return null;
    }
}

