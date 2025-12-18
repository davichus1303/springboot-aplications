package com.informaticonfig.api1.springboot_applications.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.api1.springboot_applications.models.Workers;
import com.informaticonfig.api1.springboot_applications.models.dto.DTOClass;

@RestController
@RequestMapping("/api")
public class EjemploRestController {
    @RequestMapping(path = "/rest_controller", method = RequestMethod.GET)
    public DTOClass trayingRestApi() {
        DTOClass userOne = new DTOClass();
        userOne.setTitle("Ejemplo de REST Controller");
        userOne.setUser("Usuario_API_1");
        return userOne;
    }
}
