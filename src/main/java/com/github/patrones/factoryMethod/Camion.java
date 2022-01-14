package com.github.patrones.factoryMethod;

public class Camion implements ITransporte {


    @Override
    public void repartir() {
        System.out.println("Repartiendo en camión.");
    }
}
