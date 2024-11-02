package com.example.APIVikingos.service;

import com.example.APIVikingos.model.Actor;
import com.example.APIVikingos.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio de negocio en la capa de servicio
public class ActorService {
    private final ActorRepository actorRepository; // Repositorio para realizar operaciones sobre actores

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository; // Asigna el repositorio recibido a la variable de instancia
    }

    // Metodo para obtener todos los actores
    public List<Actor> obtenerTodosActores(){
        // Llama al metodo findAll() del repositorio para obtener la lista de actores
        return actorRepository.findAll();
    }
}

