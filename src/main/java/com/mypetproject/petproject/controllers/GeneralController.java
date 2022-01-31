package com.mypetproject.petproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class GeneralController {


    @GetMapping("/")
    public String indexPage(Model model) {
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}

//    public static void main(String[] args) {
//
//    }
//}