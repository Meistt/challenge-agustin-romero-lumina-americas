package com.alkemy.agustin.romero.repository;

import com.alkemy.agustin.romero.models.Genero;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class RepositorioGeneroImpl implements RepositorioGenero{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Genero buscarGenero(Long id) {
        return null;
    }

    @Override
    public void agregarGenero(Genero nuevo) {

    }

    @Override
    public Boolean existeGenero(Long id) {
        return null;
    }

    @Override
    public void eliminarGenero(Long id) {

    }

    @Override
    public List<Genero> getGeneroList() {
        return null;
    }
}
