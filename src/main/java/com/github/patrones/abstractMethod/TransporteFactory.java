package com.github.patrones.abstractMethod;

public class TransporteFactory implements ITransporte{


    @Override
    public Camion crearCamion() {
        return new Camion();
    }

    @Override
    public Barco crearBarco() {
        return new Barco();
    }
}
