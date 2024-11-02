package com.example.APIVikingos.service;

import com.example.APIVikingos.model.Capitulo;
import com.example.APIVikingos.repository.CapituloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indica que esta clase es un servicio de negocio en la capa de servicio
public class CapituloService {
    private final CapituloRepository capituloRepository; // Repositorio para realizar operaciones sobre capítulos

    public CapituloService(CapituloRepository capituloRepository) {
        this.capituloRepository = capituloRepository; // Asigna el repositorio recibido a la variable de instancia
    }

    // Metodo para obtener todos los capítulos
    public List<Capitulo> obtenerTodosCapitulos(){
        // Llama al metodo findAll() del repositorio para obtener la lista de capítulos
        return capituloRepository.findAll();
    }

    // Metodo para obtener un capítulo por su ID
    public Optional<Capitulo> obtenerCapituloPorId(Long id) {
        // Llama al metodo findById() del repositorio para buscar el capítulo por su ID
        return capituloRepository.findById(id);
    }

    // Metodo para guardar un capítulo
    public void guardar(Capitulo capitulo) {
        // Llama al metodo save() del repositorio para guardar el capítulo
        capituloRepository.save(capitulo);
    }
}

