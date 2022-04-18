package com.alkemy.agustin.romero.service;

import com.alkemy.agustin.romero.models.Genero;
import com.alkemy.agustin.romero.repository.RepositorioGenero;
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
    public Genero agregarGenero(Genero nuevo){
        this.repositorioGenero.agregarGenero(nuevo);
        return nuevo;
    }

    @Override
    public Boolean eliminarGenero(Long id) {
        Boolean eliminado = false;
        this.repositorioGenero.eliminarGenero(id);
        if(!existeGenero(id)){
            eliminado = true;
        }else
            eliminado = false;

        return eliminado;
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
        return this.repositorioGenero.getGeneroList();
    }
}
