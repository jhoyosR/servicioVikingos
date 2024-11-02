package com.example.APIVikingos.controller;

import com.example.APIVikingos.model.VikingosInfo;
import com.example.APIVikingos.service.VikingosInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/vikingos/info") // Define la ruta base para las solicitudes de este controlador
public class VikingosInfoController {

    private final VikingosInfoService vikingosInfoService; // Servicio para manejar la lógica de información de vikingos

    public VikingosInfoController(VikingosInfoService vikingosInfoService) {
        this.vikingosInfoService = vikingosInfoService; // Asigna el servicio recibido a la variable de instancia
    }

    @GetMapping // Mapea solicitudes GET a la ruta /vikingos/info
    public String mostrarInformacion(Model model) {
        // Obtiene la lista de información de vikingos a través del servicio
        List<VikingosInfo> vikingosInfos = vikingosInfoService.obtenerTodosVikingosInfo();
        // Agrega la lista de información al modelo para ser utilizada en la vista
        model.addAttribute("vikingosInfos", vikingosInfos);
        // Retorna el nombre de la plantilla Thymeleaf que se debe renderizar
        return "info"; // Nombre de la plantilla Thymeleaf (info.html)
    }
}
