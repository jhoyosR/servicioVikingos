package com.example.APIVikingos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos
@Data // Genera automáticamente los métodos getter, setter, toString, equals y hashCode
public class VikingosInfo {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la clave primaria automáticamente
    private Long id; // Identificador único de la información sobre vikingos

    private String nombre; // Nombre de la serie o personaje
    private String descripcion; // Descripción de la serie o personaje
    private String poster; // URL del póster de la serie
    private String creador; // Nombre del creador de la serie
    private String clasificacion; // Clasificación de la serie (ej. PG, R, etc.)
    private double calificacionPromedio; // Calificación promedio de la serie
    private String mejorCapitulo; // Título del mejor capítulo
    private int temporadas; // Número de temporadas de la serie
    private int anioEmision; // Año de emisión de la serie
}

