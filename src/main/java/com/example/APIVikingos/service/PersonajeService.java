package com.example.APIVikingos.service;

import com.example.APIVikingos.model.Personaje;
import com.example.APIVikingos.repository.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio de negocio en la capa de servicio
public class PersonajeService {
    private final PersonajeRepository personajeRepository; // Repositorio para realizar operaciones sobre personajes

    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository; // Asigna el repositorio recibido a la variable de instancia
    }

    // Metodo para obtener todos los personajes
    public List<Personaje> obtenerTodosPersonajes(){
        // Llama al metodo findAll() del repositorio para obtener la lista de personajes
        return personajeRepository.findAll();
    }
}

