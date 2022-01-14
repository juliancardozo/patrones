package com.github.patrones.builder;

import lombok.Data;

@Data
public class ConstructorManualDeAuto implements IConstructor{
    private String tipo;
    private String motor;
    private int asientos;
    private int puertas;
    private int cambios;

    public Manual getResult() {
        return new Manual(tipo,motor,asientos,puertas,cambios);
    }
}
