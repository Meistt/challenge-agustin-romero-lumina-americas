package com.alkemy.agustin.romero.controllers;

import com.alkemy.agustin.romero.models.Personaje;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {

    @RequestMapping(value = "character/{id}")
    public Personaje getPersonaje(@PathVariable Long id){
        Personaje nuevo = new Personaje();
        nuevo.setIdPersonaje(id);
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }

    @RequestMapping(value = "character111")
    public Personaje editar(){
        Personaje nuevo = new Personaje();
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }

    @RequestMapping(value = "character222")
    public Personaje eliminar(){
        Personaje nuevo = new Personaje();
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }

    @RequestMapping(value = "character333")
    public Personaje buscar(){
        Personaje nuevo = new Personaje();
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }
}
