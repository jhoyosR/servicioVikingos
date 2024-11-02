package com.example.APIVikingos.controller;

import com.example.APIVikingos.model.Temporada;
import com.example.APIVikingos.service.TemporadaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vikingos/temporadas") // Define la ruta base para las solicitudes de este controlador
public class TemporadaController {

    private final TemporadaService temporadaService; // Servicio para manejar la lógica de temporadas

    public TemporadaController(TemporadaService temporadaService) {
        this.temporadaService = temporadaService; // Asigna el servicio recibido a la variable de instancia
    }

    @GetMapping // Mapea solicitudes GET a la ruta /vikingos/temporadas
    public String mostrarTemporadas(Model model) {
        // Obtiene la lista de todas las temporadas a través del servicio
        List<Temporada> temporadas = temporadaService.obtenerTodasTemporadas();
        // Agrega la lista de temporadas al modelo para ser utilizada en la vista
        model.addAttribute("temporadas", temporadas);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "temporadas"; // Nombre de la plantilla Thymeleaf (temporadas.html)
    }

    // Mostrar formulario para agregar una temporada
    @GetMapping("/nuevo") // Mapea solicitudes GET a /vikingos/temporadas/nuevo
    public String mostrarFormularioNuevaTemporada(Model model) {
        model.addAttribute("temporada", new Temporada()); // Pasar un objeto vacío al modelo
        // Retorna el nombre de la plantilla para el formulario de temporada
        return "formularioTemporada"; // Nombre de la plantilla HTML (formularioTemporada.html)
    }

    // Procesar el formulario para agregar una temporada
    @PostMapping("/guardar") // Mapea solicitudes POST a /vikingos/temporadas/guardar
    public String guardarTemporada(@ModelAttribute Temporada temporada) {
        // Guarda la temporada usando el servicio
        temporadaService.guardar(temporada);
        // Redirige a la página de la lista de temporadas
        return "redirect:/vikingos/temporadas"; // Redirige a la lista de temporadas
    }
}

