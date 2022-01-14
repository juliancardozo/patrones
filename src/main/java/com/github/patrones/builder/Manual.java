package com.github.patrones.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class Manual {

    private String tipo;
    private String motor;
    private int asientos;
    private int puertas;
    private int cambios;

    public Manual getResult() {
        return new Manual(tipo,motor,asientos,puertas,cambios);
    }

    @Override
    public String toString() {
        return "Manual{" +
                "tipo='" + tipo + '\'' +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                ", puertas=" + puertas +
                ", cambios=" + cambios +
                '}';
    }
}