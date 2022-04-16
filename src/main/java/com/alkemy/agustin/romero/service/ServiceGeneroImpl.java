package com.alkemy.agustin.romero.service;

import com.alkemy.agustin.romero.models.Genero;
import com.alkemy.agustin.romero.repository.RepositorioGenero;
import com.alkemy.agustin.romero.repository.RepositorioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceGenero")
public class ServiceGeneroImpl implements ServiceGenero{
    private RepositorioGenero repositorioGenero;

    @Autowired
    public ServiceGeneroImpl(RepositorioGenero repositorioGenero){
        this.repositorioGenero = repositorioGenero;
    }


    @Override
    public Genero buscarGenero(Long id) {
        Genero buscado = new Genero();
        return this.repositorioGenero.buscarGenero(id);
    }

    @Override
    public Boolean agregarGenero(Long id, String nombreGenero){
        Boolean creado = false;
        if(!existeGenero(id)){
            Genero nuevo = new Genero();
            nuevo.setIdGenero(id);
            nuevo.setNombre(nombreGenero);
            this.repositorioGenero.agregarGenero(nuevo);
            creado = true;
        }else creado = false;

        return creado;

    }

    @Override
    public Boolean eliminarGenero(Long id) {
        return null;
    }

    @Override
    public Boolean existeGenero(Long id) {
        Genero buscado = new Genero();
        buscado = this.buscarGenero(id);
        Boolean encontrado = false;
        if(buscado.getIdGenero().equals(id)){
            encontrado = true;
        }else encontrado = false;

        return encontrado;
    }

    @Override
    public List<Genero> getGeneroList() {
        return null;
    }
}
