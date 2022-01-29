package com.mypetproject.petproject.controllers;

import com.mypetproject.petproject.models.Tag;
import com.mypetproject.petproject.repository.TagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/tags")
    public String tagsList(Model model) {
        List<Tag> tag = tagRepository.findAll();
        model.addAttribute("tag", tag);
        return "tags";
    }
}
