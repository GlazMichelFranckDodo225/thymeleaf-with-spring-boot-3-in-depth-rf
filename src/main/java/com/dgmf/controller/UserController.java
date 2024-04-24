package com.dgmf.controller;

import com.dgmf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    // Handler Method for "/variable-expression" Request
    // http://localhost:8080/variable-expression
    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        // User Object
        User user = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        // Store User Object into Model
        model.addAttribute("user", user);

        // Return Thymeleaf Html Template View Name
        return "variable-expression";
    }

    // Handler Method for "/selection-expression" Request
    // http://localhost:8080/selection-expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        // User Object
        User user = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        // Store User Object into Model
        model.addAttribute("user", user);

        // Return Thymeleaf Html Template View Name
        return "selection-expression";
    }

    // Handler Method for "/message-expression" Request
    // http://localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression() {
        // Return Thymeleaf Html Template View Name
        return "message-expression";
    }

    // Handler Method for "/link-expression" Request
    // http://localhost:8080/link-expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        // Return Thymeleaf Html Template View Name
        return "link-expression";
    }
}
