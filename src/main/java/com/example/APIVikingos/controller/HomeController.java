package com.example.APIVikingos.controller;

import com.example.APIVikingos.model.VikingosInfo;
import com.example.APIVikingos.service.VikingosInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {

    private final VikingosInfoService vikingosInfoService; // Servicio para manejar información sobre vikingos

    public HomeController(VikingosInfoService vikingosInfoService) {
        this.vikingosInfoService = vikingosInfoService; // Asigna el servicio recibido a la variable de instancia
    }

    @GetMapping("/") // Mapea solicitudes GET a la raíz del contexto
    public String index(Model model) {
        // Obtener información
        List<VikingosInfo> vikingosInfos = vikingosInfoService.obtenerTodosVikingosInfo();
        // Agrega la lista de información de vikingos al modelo para ser utilizada en la vista
        model.addAttribute("vikingosInfos", vikingosInfos);

        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "index"; // El nombre de la plantilla (index.html)
    }
}


