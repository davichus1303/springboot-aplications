package com.informaticonfig.api1.springboot_applications.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.api1.springboot_applications.models.Workers;

@RestController
@RequestMapping("/api")
public class EjemploRestController {
    @RequestMapping(path = "/rest_controller", method = RequestMethod.GET)
    public Map<String, Object> trayingRestApi() {
        Workers worker = new Workers("John", "Doe", "123 Main St", "Developer", 30, 1234567890);
        Map<String, Object> response = new HashMap<>();
        response.put("worker", worker);
        return response;
    }
}
