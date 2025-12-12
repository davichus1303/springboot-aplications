package com.informaticonfig.api1.springboot_applications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {
    @GetMapping("/Información_EjemploController")
    public String info() {
        return "Información_EjemploController";
    }
}
