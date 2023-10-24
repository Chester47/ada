package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(path = "api.exchangeratesapi.io/v1/latest")
    public String helloWorld() {
        return "amogus";
    }
}
