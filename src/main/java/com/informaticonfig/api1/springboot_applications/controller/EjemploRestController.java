package com.informaticonfig.api1.springboot_applications.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploRestController {
    @GetMapping("/rest_controller")
    public Map<String, Object> info() {
        Map<String, Object> response = new HashMap<>();
        response.put("titulo", "¡Hola desde EjemploRestController!");
        response.put("descripcion", "Esta es una respuesta JSON de ejemplo que muestra cómo usar un controlador REST en Spring Boot.");
        response.put("mensaje", "¡Esta es la información proporcionada por el EjemploRestController!");
        return response;
    }
}
