package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // create a mapping for "/hello"

    @GetMapping("/homepage2")
    public String homePage(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        theModel.addAttribute("firstName", "Oleksandr");
        theModel.addAttribute("lastName", "Pik");


        return "index2";
    }

    @GetMapping("/hi")
    public String hi(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        theModel.addAttribute("firstName", "Oleksandr");
        theModel.addAttribute("lastName", "Pik");


        return "helloworld";
    }

    @GetMapping("/homepage")
    public String homePage2(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        theModel.addAttribute("firstName", "Oleksandr");
        theModel.addAttribute("lastName", "Pik");


        return "homepage";
    }

    @GetMapping("/homepage1")
    public String homePage1(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        theModel.addAttribute("firstName", "Oleksandr");
        theModel.addAttribute("lastName", "Pik");


        return "index";
    }

}
