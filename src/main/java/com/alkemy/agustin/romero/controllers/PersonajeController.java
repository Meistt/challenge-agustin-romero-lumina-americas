package com.alkemy.agustin.romero.controllers;

import com.alkemy.agustin.romero.models.Personaje;
import com.alkemy.agustin.romero.service.ServicePersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/characters")
public class PersonajeController {

    @Autowired
    ServicePersonaje servicePersonaje;

    @GetMapping()
    public List<Personaje> getPersonajesList(){
        return this.servicePersonaje.getPersonajesList();
    }

    @PostMapping()
    public Boolean nuevoPersonaje(@RequestBody Personaje nuevo){
        Long id = nuevo.getIdPersonaje();
        String nombre = nuevo.getNombre();
        Integer edad = nuevo.getEdad();
        Double peso = nuevo.getPeso();
        String historia = nuevo.getHistoria();
        return this.servicePersonaje.nuevoPersonaje(id, nombre, edad, peso, historia);
    }



    /*//@RequestMapping(value = "/characterhgfdgdhs", method = RequestMethod.GET)
    public Personaje getPersonaje(@PathVariable Long id){
        Personaje nuevo = new Personaje();
        nuevo.setIdPersonaje(id);
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }

    //@RequestMapping(value = "/characters", method = RequestMethod.GET)
    @GetMapping(value = "/{id}")
    public Personaje listar(){
        return null;
    }

    //@RequestMapping(value = "character222")
    public Personaje eliminar(){
        Personaje nuevo = new Personaje();
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }

    //@RequestMapping(value = "character333")
    public Personaje buscar(){
        Personaje nuevo = new Personaje();
        nuevo.setNombre("Tarzan");
        nuevo.setEdad(33);
        nuevo.setPeso(80.5);
        nuevo.setHistoria("Vida de gato");
        return nuevo;
    }*/
}
