package com.github.patrones.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Auto {

    private String tipo;
    private String motor;
    private int asientos;
    private int puertas;
    private int cambios;

    private double tanqueDeNafta = 0;

    @Override
    public String toString() {
        return "Auto{" +
                "tipo='" + tipo + '\'' +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                ", puertas=" + puertas +
                ", cambios=" + cambios +
                ", tanqueDeNafta=" + tanqueDeNafta +
                '}';
    }
}
