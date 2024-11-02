package com.example.APIVikingos.service;

import com.example.APIVikingos.model.ActuacionPrincipal;
import com.example.APIVikingos.repository.ActuacionPrincipalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio de negocio en la capa de servicio
public class ActuacionPrincipalService {
    private final ActuacionPrincipalRepository actuacionPrincipalRepository; // Repositorio para realizar operaciones sobre actuaciones principales

    public ActuacionPrincipalService(ActuacionPrincipalRepository actuacionPrincipalRepository) {
        this.actuacionPrincipalRepository = actuacionPrincipalRepository; // Asigna el repositorio recibido a la variable de instancia
    }

    // Metodo para obtener todas las actuaciones principales
    public List<ActuacionPrincipal> obtenerTodasActuacionPrincipals() {
        // Llama al metodo findAll() del repositorio para obtener la lista de actuaciones principales
        return actuacionPrincipalRepository.findAll();
    }
}

