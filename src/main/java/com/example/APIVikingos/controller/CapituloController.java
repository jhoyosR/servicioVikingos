package com.example.APIVikingos.controller;

import com.example.APIVikingos.exception.RecursoNoEncontradoException;
import com.example.APIVikingos.model.Capitulo;
import com.example.APIVikingos.repository.CapituloRepository;
import com.example.APIVikingos.service.CapituloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vikingos/capitulos") // Define la ruta base para las solicitudes de este controlador
public class CapituloController {

    private final CapituloService capituloService; // Servicio para manejar la lógica de capítulos

    public CapituloController(CapituloService capituloService) {
        this.capituloService = capituloService; // Asigna el servicio recibido a la variable de instancia
    }

    @GetMapping // Mapea solicitudes GET a la ruta /vikingos/capitulos
    public String mostrarCapitulos(Model model) {
        // Obtiene la lista de todos los capítulos a través del servicio
        List<Capitulo> capitulos = capituloService.obtenerTodosCapitulos();
        // Agrega la lista de capítulos al modelo para ser utilizada en la vista
        model.addAttribute("capitulos", capitulos);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "capitulosAll"; // Nombre de la plantilla Thymeleaf (capitulosAll.html)
    }

    @GetMapping("/{id}") // Mapea solicitudes GET a /vikingos/capitulos/{id}
    public String mostrarCapituloPorId(@PathVariable Long id, Model model) {
        // Obtiene un capítulo por su ID, lanzando una excepción si no se encuentra
        Capitulo capitulo = capituloService.obtenerCapituloPorId(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Este capítulo no existe"));
        // Agrega el capítulo al modelo para ser utilizado en la vista
        model.addAttribute("capitulo", capitulo);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "capitulo"; // Nombre de la plantilla Thymeleaf (capitulo.html)
    }

    // Mostrar formulario para agregar un capítulo
    @GetMapping("/nuevo") // Mapea solicitudes GET a /vikingos/capitulos/nuevo
    public String mostrarFormularioNuevoCapitulo(Model model) {
        model.addAttribute("capitulo", new Capitulo()); // Pasar un objeto vacío al modelo
        // Retorna el nombre de la plantilla para el formulario de capítulo
        return "formularioCapitulo"; // Nombre de la plantilla HTML (formularioCapitulo.html)
    }

    // Procesar el formulario para agregar un capítulo
    @PostMapping("/guardar") // Mapea solicitudes POST a /vikingos/capitulos/guardar
    public String guardarCapitulo(@ModelAttribute Capitulo capitulo) {
        // Guarda el capítulo usando el servicio
        capituloService.guardar(capitulo);
        // Redirige a la página de la lista de capítulos
        return "redirect:/vikingos/capitulos"; // Redirige a la lista de capítulos
    }
}

