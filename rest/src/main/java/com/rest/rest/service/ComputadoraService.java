package com.rest.rest.service;

import com.rest.rest.model.ComputadoraModelo;
import com.rest.rest.model.ComputadoraRecord;
import com.rest.rest.model.DiscoRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputadoraService {
    private ComputadoraModelo computadoraModelo;

    @Autowired
    public ComputadoraService(ComputadoraModelo computadoraModelo){
        this.computadoraModelo = computadoraModelo;
    }
    public List<ComputadoraRecord> obtenerComputadoras(@PathVariable String marca){
        return computadoraModelo.computadoras.stream()
                .filter(computadora -> computadora.marca().equals(marca))
                .collect(Collectors.toList());
    }

    public List<ComputadoraRecord> listarCompus(){
        DiscoRecord discoWestern = new DiscoRecord("Western Digital", 1, 64);
        DiscoRecord discoSeagate = new DiscoRecord("Seagate", 8, 256);
        return Arrays.asList(new ComputadoraRecord("Lenovo","16GB",discoWestern),
                new ComputadoraRecord("HP","32GB",discoSeagate));
    }


}
