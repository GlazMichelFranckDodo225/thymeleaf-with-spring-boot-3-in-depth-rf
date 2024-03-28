package com.dgmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    // Handler Method for "/hello-world" Request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model) {
        // Store Data into Model
        model.addAttribute(
                "message", "Hello World !"
        );

        // Return Thymeleaf Html Template View Name
        return "hello-world";
    }
}
