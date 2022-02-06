package com.mypetproject.petproject;

import com.mypetproject.petproject.models.Record;
import com.mypetproject.petproject.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
