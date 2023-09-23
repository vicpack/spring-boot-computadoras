package com.rest.rest.controller;

import com.rest.rest.model.ComputadoraModelo;
import com.rest.rest.model.ComputadoraRecord;
import com.rest.rest.model.DiscoRecord;
import com.rest.rest.service.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
public class ComputadoraController {
    @Autowired
    ComputadoraService computadoraService;

    @GetMapping("/v1/computadoras/{marca}")
    public List<ComputadoraRecord> obtenerComputadoras(@PathVariable String marca){
        return computadoraService.obtenerComputadoras(marca);
    }

    @GetMapping
    public List<ComputadoraRecord> listarCompus(){
        return computadoraService.listarCompus();
    }
}
