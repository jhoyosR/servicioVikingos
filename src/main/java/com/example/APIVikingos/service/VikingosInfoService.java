package com.example.APIVikingos.service;

import com.example.APIVikingos.model.VikingosInfo;
import com.example.APIVikingos.repository.VikingosInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio de negocio en la capa de servicio
public class VikingosInfoService {
    private final VikingosInfoRepository vikingosInfoRepository; // Repositorio para realizar operaciones sobre información de vikingos

    public VikingosInfoService(VikingosInfoRepository vikingosInfoRepository) {
        this.vikingosInfoRepository = vikingosInfoRepository; // Asigna el repositorio recibido a la variable de instancia
    }

    // Metodo para obtener toda la información sobre vikingos
    public List<VikingosInfo> obtenerTodosVikingosInfo(){
        // Llama al metodo findAll() del repositorio para obtener la lista de información sobre vikingos
        return vikingosInfoRepository.findAll();
    }
}
