package com.example.APIVikingos.repository;

import com.example.APIVikingos.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    // Esta interfaz extiende JpaRepository para proporcionar operaciones CRUD
    // No se requieren métodos adicionales, ya que JpaRepository ya proporciona métodos estándar como
    // save(), findById(), findAll(), deleteById(), entre otros.
}
