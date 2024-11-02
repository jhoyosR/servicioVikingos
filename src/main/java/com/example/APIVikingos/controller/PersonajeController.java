package com.example.APIVikingos.controller;

import com.example.APIVikingos.model.Personaje;
import com.example.APIVikingos.service.PersonajeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/vikingos/personajes") // Define la ruta base para las solicitudes de este controlador
public class PersonajeController {

    private final PersonajeService personajeService; // Servicio para manejar la lógica de personajes

    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService; // Asigna el servicio recibido a la variable de instancia
    }

    @GetMapping // Mapea solicitudes GET a la ruta /vikingos/personajes
    public String mostrarPersonajes(Model model) {
        // Obtiene la lista de todos los personajes a través del servicio
        List<Personaje> personajes = personajeService.obtenerTodosPersonajes();
        // Agrega la lista de personajes al modelo para ser utilizada en la vista
        model.addAttribute("personajes", personajes);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "personajes"; // Nombre de la plantilla Thymeleaf (personajes.html)
    }
}

