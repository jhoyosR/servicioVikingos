package com.example.APIVikingos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.APIVikingos.model.Actor;
import com.example.APIVikingos.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/vikingos/actores") // Define la ruta base para las solicitudes de este controlador
public class ActorController {

    private final ActorService actorService; // Servicio para manejar la lógica de actores

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    // Mapea solicitudes GET a la ruta /vikingos/actores
    @GetMapping
    public String obtenerActores(Model model) {
        // Obtiene la lista de todos los actores a través del servicio
        List<Actor> actores = actorService.obtenerTodosActores();
        // Agrega la lista de actores al modelo para ser utilizada en la vista
        model.addAttribute("actores", actores);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "actores"; //Nombre de la plantilla Thymeleaf (actores.html)
    }
}
