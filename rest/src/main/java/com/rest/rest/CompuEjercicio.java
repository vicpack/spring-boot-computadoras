package com.rest.rest;

import com.rest.rest.model.AlumnoRecord;
import com.rest.rest.model.ComputadoraRecord;
import com.rest.rest.model.DiscoRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class CompuEjercicio {

    public static void main(String[] args) {
        SpringApplication.run(CompuEjercicio.class, args);
    }

}
