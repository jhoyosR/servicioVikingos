package com.example.APIVikingos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity // Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos
@Data // Genera automáticamente los métodos getter, setter, toString, equals y hashCode
public class ActuacionPrincipal {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la clave primaria automáticamente
    private Long id; // Identificador único de la actuación principal

    @ManyToOne // Relación muchos a uno con la entidad Actor
    private Actor actor; // Actor asociado a la actuación principal

    @ManyToOne // Relación muchos a uno con la entidad Temporada
    private Temporada temporada; // Temporada asociada a la actuación principal
}


