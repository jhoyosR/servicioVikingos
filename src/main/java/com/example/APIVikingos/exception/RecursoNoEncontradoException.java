package com.example.APIVikingos.exception;

public class RecursoNoEncontradoException extends RuntimeException {
    // Constructor que recibe un mensaje de error
    public RecursoNoEncontradoException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase base (RuntimeException) con el mensaje
    }
}


