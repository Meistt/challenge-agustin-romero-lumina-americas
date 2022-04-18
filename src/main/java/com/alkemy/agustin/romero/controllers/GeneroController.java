package com.alkemy.agustin.romero.controllers;

import com.alkemy.agustin.romero.models.Genero;
import com.alkemy.agustin.romero.service.ServiceGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/genre")
public class GeneroController {

    @Autowired
    ServiceGenero serviceGenero;

    @GetMapping()
    public List<Genero> getGeneroList(){
        return this.serviceGenero.getGeneroList();
    }

    @PostMapping()
    public Genero agregarGenero(@RequestBody Genero nuevo){
        return this.serviceGenero.agregarGenero(nuevo);

    }
}
