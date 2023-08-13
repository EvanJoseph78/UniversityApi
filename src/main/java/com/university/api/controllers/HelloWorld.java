package com.university.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {
    @GetMapping
    public String ola() {
        return "Evandro José da Silva Mariano";
    }
}
