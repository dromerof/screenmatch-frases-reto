package com.aluracursos.screenmatch_frases_reto.service;

import com.aluracursos.screenmatch_frases_reto.dto.FraseDTO;
import com.aluracursos.screenmatch_frases_reto.model.Frase;
import com.aluracursos.screenmatch_frases_reto.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
        private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {

        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
