package com.university.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.api.aluno.DtoCadastroAluno;

@RestController
@RequestMapping("/aluno")
public class Aluno {
    
    @PostMapping
    public String cadastrar(@RequestBody DtoCadastroAluno dados) {
        System.out.println(dados);
        return "Enviado com sucesso";
    }
}
