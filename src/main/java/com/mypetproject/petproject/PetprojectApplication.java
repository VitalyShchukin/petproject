package com.mypetproject.petproject;

import com.mypetproject.petproject.models.Record;
import com.mypetproject.petproject.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class PetprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetprojectApplication.class, args);
    }
}
