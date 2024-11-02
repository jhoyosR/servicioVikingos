package com.example.APIVikingos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos
@Data // Genera automáticamente los métodos getter, setter, toString, equals y hashCode
public class Actor {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la clave primaria automáticamente
    private Long id; // Identificador único del actor

    private String nombre; // Nombre del actor

    @OneToOne // Relación uno a uno con la entidad Personaje
    private Personaje personaje; // Personaje asociado al actor
}


