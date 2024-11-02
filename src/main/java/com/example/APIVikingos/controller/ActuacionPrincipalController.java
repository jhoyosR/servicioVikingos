package com.example.APIVikingos.controller;

import com.example.APIVikingos.model.ActuacionPrincipal;
import com.example.APIVikingos.service.ActuacionPrincipalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vikingos/actuacionesprincipales") // Define la ruta base para las solicitudes de este controlador
public class ActuacionPrincipalController {

    private final ActuacionPrincipalService actuacionPrincipalService; // Servicio para manejar la lógica de actuaciones principales

    public ActuacionPrincipalController(ActuacionPrincipalService actuacionPrincipalService) {
        this.actuacionPrincipalService = actuacionPrincipalService;
    }

    @GetMapping // Mapea solicitudes GET a la ruta /vikingos/actuacionesprincipales
    public String mostrarActuacionesPrincipales(Model model) {
        // Obtiene la lista de todas las actuaciones principales a través del servicio
        List<ActuacionPrincipal> actuacionesPrincipales = actuacionPrincipalService.obtenerTodasActuacionPrincipals();
        // Agrega la lista de actuaciones principales al modelo para ser utilizada en la vista
        model.addAttribute("actuacionesPrincipales", actuacionesPrincipales);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "actuacionesPrincipales"; // Nombre de la plantilla Thymeleaf (actuacionesPrincipales.html)
    }

}

