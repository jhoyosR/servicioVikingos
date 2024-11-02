package com.example.APIVikingos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos
@Data // Genera automáticamente los métodos getter, setter, toString, equals y hashCode
public class Personaje {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la clave primaria automáticamente
    private Long id; // Identificador único del personaje

    private String nombre; // Nombre del personaje
    private String descripcion; // Descripción del personaje
    private String foto; // URL de la foto del personaje
    private String estatus; // Estado del personaje (ej. vivo, muerto, etc.)
}


