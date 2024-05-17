package com.dgmf.controller;

import com.dgmf.entity.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // Handler Method for User Registration Page Request
    @GetMapping("/register")
    public String userRegistrationPage(Model model) {
        // Empty UserForm Object to Store User Data
        UserForm userForm = new UserForm();
        List<String> listOfProfessions = Arrays.asList("Developer", "Tester", "Architect");

        model.addAttribute("userForm", userForm);
        model.addAttribute("listOfProfessions", listOfProfessions);

        return "form/register-form";
    }

    // Handler Method for User Registration Form Submission Request
    @PostMapping("/register/save")
    public String submitForm(
            Model model,
            // Now, userForm Object contains all the Form Data
            // To Get Form Data inside userForm Object
            @ModelAttribute("userForm") UserForm userForm
    ) {
        model.addAttribute("userForm", userForm);

        return "form/register-success";
    }
}
