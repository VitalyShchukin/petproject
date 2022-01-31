package com.mypetproject.petproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class PetprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetprojectApplication.class, args);

    }
}
