package com.mypetproject.petproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherController {

    @GetMapping("/") //main page
    public String indexPage(Model model) {
        return "index";
    }

    @GetMapping("/about") //about project page
    public String about(Model model) {
        return "about";
    }
}