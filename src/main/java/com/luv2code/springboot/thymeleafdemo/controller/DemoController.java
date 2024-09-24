package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // create a mapping for "/hello"

    @GetMapping("/home")
    public String homePage(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        theModel.addAttribute("firstName", "Oleksandr");
        theModel.addAttribute("lastName", "Pik");


        return "homepage";
    }
}
