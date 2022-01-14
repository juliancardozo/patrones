package com.github.patrones.abstractMethod;

import com.github.patrones.factoryMethod.ITransporte;

public class Barco implements ITransporte {

    public Barco() {
        System.out.println("Creando un nuevo Barco.");
    }

    @Override
    public void repartir() {
        System.out.println("Repartiendo en barco.");
    }
}
