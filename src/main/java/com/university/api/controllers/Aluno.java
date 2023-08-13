package com.university.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class Aluno {
    @GetMapping
    public String aluno() {
        return "Está é a página do aluno";
    }
    
    @PostMapping
    public String cadastrar(@RequestBody String json) {
        System.out.println(json);
        return "Enviado com sucesso";
    }
}
