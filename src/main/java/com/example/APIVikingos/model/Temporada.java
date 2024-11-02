package com.example.APIVikingos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos
@Data // Genera automáticamente los métodos getter, setter, toString, equals y hashCode
public class Temporada {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la clave primaria automáticamente
    private Long id; // Identificador único de la temporada

    private int numeroTemporada; // Número de la temporada
    private int anioEmision; // Año de emisión de la temporada
    private int numeroCapitulos; // Número total de capítulos en la temporada
}


