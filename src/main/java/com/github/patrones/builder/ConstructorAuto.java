package com.github.patrones.builder;

import lombok.Data;

@Data
public class ConstructorAuto implements IConstructor{
    private String tipo;
    private String motor;
    private int asientos;
    private int puertas;
    private int cambios;

    public Auto getResult() {
        return new Auto(tipo,motor,asientos,puertas,cambios,0.0);
    }
}
