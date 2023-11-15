package com.example.Bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/mi_primeraprueba")
    public String mostarString(){
        return "Hola esta es mi primera prueba en springboot";

    }
    @GetMapping("/generar-password")
    public String generarContraeña(){
        double aleatorio = Math.random() * 10000000;
        long aleatorioRedondeado = Math.round(aleatorio);

        return "jahsybvhvf" + aleatorioRedondeado;

    }
}
