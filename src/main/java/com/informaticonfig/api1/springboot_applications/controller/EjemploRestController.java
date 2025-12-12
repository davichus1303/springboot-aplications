package com.informaticonfig.api1.springboot_applications.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EjemploRestController {
    @RequestMapping(path = "/rest_controller", method = RequestMethod.GET)
    public Map<String, Object> trayingRestApi() {
        Map<String, Object> response = new HashMap<>();
        response.put("titulo", "¡Hola desde EjemploRestController!");
        response.put("descripcion", "Esta es una respuesta JSON de ejemplo que muestra cómo usar un controlador REST en Spring Boot.");
        response.put("mensaje", "¡Esta es la información proporcionada por el EjemploRestController!");
        return response;
    }
}
