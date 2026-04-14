package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World from Spring Boot!";
    }
    
    @GetMapping("/api/hello")
    public String apiHello() {
        return "Hello from API endpoint!";
    }
}
