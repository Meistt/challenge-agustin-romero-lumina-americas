package com.alkemy.agustin.romero.service;

import com.alkemy.agustin.romero.models.Personaje;
import com.alkemy.agustin.romero.repository.RepositorioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("servicioPersonaje")
public class ServicePersonajeImpl implements ServicePersonaje{

    private RepositorioPersonaje repositorioPersonaje;

    @Autowired
    public ServicePersonajeImpl(RepositorioPersonaje repositorioPersonaje){
        this.repositorioPersonaje = repositorioPersonaje;
    }

    @Override
    public Boolean nuevoPersonaje(Long id, String nombre, Integer edad, Double peso, String historia) {
        Boolean creado = false;
        if(!existe(id)){
            Personaje nuevo = new Personaje();
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            nuevo.setPeso(peso);
            nuevo.setHistoria(historia);
            this.repositorioPersonaje.crearPersonaje(nuevo);
            creado = true;
        }else creado = false;

        return creado;
    }

    @Override
    public String editarPersonaje(Long id, String nombre, Integer edad, Double peso, String historia) {
        String mensaje = " ";
        Personaje ACTUALIZADO = new Personaje();
        if(existe(id)){
            ACTUALIZADO.setNombre(nombre);
            ACTUALIZADO.setEdad(edad);
            ACTUALIZADO.setPeso(peso);
            ACTUALIZADO.setHistoria(historia);
            this.repositorioPersonaje.actualizarPersonaje(ACTUALIZADO);
            mensaje = "Personaje modificado con éxito";

        }else mensaje = "No se puede editar personaje inexistente";

        return mensaje;
    }

    @Override
    public Boolean eliminarPersonaje(Long id) {
        Boolean eliminado = false;
        if(existe(id)){
            this.repositorioPersonaje.eliminarPersonaje(id);
            eliminado = true;
        }else
            eliminado = false;

        return eliminado;
    }

    @Override
    public Personaje buscarPersonaje(Long id) {
        Personaje buscado = new Personaje();
        buscado = this.repositorioPersonaje.buscarPersonaje(id);
        return buscado;
    }

    @Override
    public Boolean existe(Long id) {
        Personaje buscado = new Personaje();
        buscado = this.repositorioPersonaje.buscarPersonaje(id);
        Boolean encontrado = false;
        if(buscado.getIdPersonaje().equals(id)){
            encontrado = true;
        }else encontrado = false; //false pq no fue encontrado ya q no existe

        return encontrado;
    }

    @Override
    public List<Personaje> buscarPorNombre(String nombre) {
        return this.repositorioPersonaje.buscarPorNombre(nombre);
    }

    @Override
    public List<Personaje> buscarPorEdad(Integer edad) {
        return this.repositorioPersonaje.buscarPorEdad(edad);
    }

    @Override
    public List<Personaje> buscarCoincidenciasPorPeliculas(Long id) {
        return this.repositorioPersonaje.buscarPeliculasDondeApareceElPersonaje();
    }

    @Override
    public List<Personaje> getPersonajesList() {
        return this.repositorioPersonaje.getPersonajesList();
    }

    @Override
    public List<Personaje> personajeDetalle(Long id) {
        return null;
    }


}
