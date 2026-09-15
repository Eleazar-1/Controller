package com.example.demo.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/joan")
    public String joan() {
        return "Hola, mundo. Te responde mi servidor.";
    }

    @GetMapping("/estado")
    public String estado() {
        return "El servidor está funcionando.";
    }

    @GetMapping("/reservas/resumen")
    public String resumen() {
        return "La gestión será sobre prestamos.";
    }

    @GetMapping("/anyo")
    public int anyo() {
        return 2026;
    }
}
