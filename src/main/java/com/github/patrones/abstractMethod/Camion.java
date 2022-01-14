package com.github.patrones.abstractMethod;

import com.github.patrones.factoryMethod.ITransporte;

public class Camion implements ITransporte {


    public Camion() {
        System.out.println("Creando un nuevo Camion.");
    }

    @Override
    public void repartir() {
        System.out.println("Repartiendo en camión.");
    }
}
