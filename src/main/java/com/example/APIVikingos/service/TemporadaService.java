package com.example.APIVikingos.service;

import com.example.APIVikingos.model.Temporada;
import com.example.APIVikingos.repository.TemporadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio de negocio en la capa de servicio
public class TemporadaService {
    private final TemporadaRepository temporadaRepository; // Repositorio para realizar operaciones sobre temporadas

    public TemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository; // Asigna el repositorio recibido a la variable de instancia
    }

    // Metodo para obtener todas las temporadas
    public List<Temporada> obtenerTodasTemporadas(){
        // Llama al metodo findAll() del repositorio para obtener la lista de temporadas
        return temporadaRepository.findAll();
    }

    // Metodo para guardar una temporada
    public void guardar(Temporada temporada) {
        // Llama al metodo save() del repositorio para guardar la temporada
        temporadaRepository.save(temporada);
    }
}

