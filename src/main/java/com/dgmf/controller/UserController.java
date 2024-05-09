package com.dgmf.controller;

import com.dgmf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    // Handler Method for "/fragment-expression" Request
    // http://localhost:8080/fragment-expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(Model model) {
        model.addAttribute("id", 1);
        // Return Thymeleaf Html Template View Name
        return "fragment-expression";
    }

    // Handler Method for "/users" Request
    // http://localhost:8080/users
    @GetMapping("/users")
    public String users(Model model) {
        User admin = User.builder()
                .name("Admin")
                .email("admin@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        User johnDoe = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("USER")
                .gender("Male")
                .build();

        User monikaLewinsky = User.builder()
                .name("Monika Lewinsky")
                .email("monikalewinsky@gmail.com")
                .role("USER")
                .gender("Female")
                .build();

        List<User> users = new ArrayList<>(List.of(admin, johnDoe, monikaLewinsky));

        model.addAttribute("users", users);
        // Return Thymeleaf Html Template View Name
        return "users";
    }

    // Handler Method for "/if-unless" Request
    // http://localhost:8080/if-unless
    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = User.builder()
                .name("Admin")
                .email("admin@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        User johnDoe = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("USER")
                .gender("Male")
                .build();

        User monikaLewinsky = User.builder()
                .name("Monika Lewinsky")
                .email("monikalewinsky@gmail.com")
                .role("USER")
                .gender("Female")
                .build();

        List<User> users = new ArrayList<>(List.of(admin, johnDoe, monikaLewinsky));

        model.addAttribute("users", users);
        // Return Thymeleaf Html Template View Name
        return "if-unless";
    }

    // Handler Method for "/switch-case" Request
    // http://localhost:8080/switch-case
    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User user = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                // .role("ADMIN")
                // .role("USER")
                .role("GUEST")
                .gender("Male")
                .build();

        model.addAttribute("user", user);

        // Return Thymeleaf Html Template View Name
        return "switch-case";
    }
}
