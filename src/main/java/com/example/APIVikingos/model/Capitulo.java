package com.example.APIVikingos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity // Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos
@Data // Genera automáticamente los métodos getter, setter, toString, equals y hashCode
public class Capitulo {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la clave primaria automáticamente
    private Long id; // Identificador único del capítulo

    @ManyToOne // Relación muchos a uno con la entidad Temporada
    private Temporada temporada; // Temporada asociada al capítulo

    private String codigo; // Código del capítulo
    private String nombre; // Nombre del capítulo
    private String descripcion; // Descripción del capítulo
    private String frstImage; // URL de la primera imagen del capítulo
    private String scondImage; // URL de la segunda imagen del capítulo
    private String calificacion; // Calificación del capítulo
}


