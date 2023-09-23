package com.rest.rest.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ComputadoraModelo {
    public List<ComputadoraRecord> computadoras;
    public ComputadoraModelo() {
        computadoras = new ArrayList<>();
        computadoras.add(new ComputadoraRecord("DELL","16GB",new DiscoRecord("toshiba",8,256)));
        computadoras.add(new ComputadoraRecord("HP","8",new DiscoRecord("toshiba",10,32)));
        computadoras.add(new ComputadoraRecord("LENOVO","64GB",new DiscoRecord("seagate",8,512)));
        computadoras.add(new ComputadoraRecord("MAC","16GB",new DiscoRecord("seagate",8,512)));
        computadoras.add(new ComputadoraRecord("DELL","16GB",new DiscoRecord("kingston",10,256)));
        computadoras.add(new ComputadoraRecord("HP","8GB",new DiscoRecord("kingston",10,256)));
        computadoras.add(new ComputadoraRecord("LENOVO","64GB",new DiscoRecord("kingston",32,32)));
        computadoras.add(new ComputadoraRecord("MAC","16GB",new DiscoRecord("samsung",8,512)));
    }
}
