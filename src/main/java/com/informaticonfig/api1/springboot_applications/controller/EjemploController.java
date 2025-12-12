package com.informaticonfig.api1.springboot_applications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {
    @GetMapping("/Informacion_EjemploController")
    public String info(Model model) {
        model.addAttribute("titulo", "¡Hola desde EjemploController!");
        model.addAttribute("descripcion", "Esta es una página de ejemplo que muestra cómo usar un controlador en Spring Boot para renderizar una vista con Thymeleaf.");
        model.addAttribute("mensaje", "¡Esta es la información proporcionada por el EjemploController!");
        return "Informacion_EjemploController";
    }
}
