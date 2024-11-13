package com.aluracursos.screenmatch_frases_reto.controller;

import com.aluracursos.screenmatch_frases_reto.dto.FraseDTO;
import com.aluracursos.screenmatch_frases_reto.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;


    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){

        return  service.obtenerFraseAleatoria();

    }
}
