package com.github.patrones.factoryMethod;

public class Barco implements ITransporte{

    @Override
    public void repartir() {
        System.out.println("Repartiendo en barco.");
    }
}
