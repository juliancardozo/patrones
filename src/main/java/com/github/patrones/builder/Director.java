package com.github.patrones.builder;

public class Director {

    public void construirAutoChico(IConstructor builder) {
        builder.setAsientos(4);
        builder.setCambios(5);
        builder.setPuertas(3);
        builder.setMotor("Motor 1000");
        builder.setTipo("AutoChico");
    }

    public void construirAutoGrande(IConstructor builder) {
        builder.setAsientos(6);
        builder.setCambios(5);
        builder.setPuertas(5);
        builder.setMotor("Motor 2000");
        builder.setTipo("AutoGrande");
    }

    public void construirAutoLujo(IConstructor builder) {
        builder.setAsientos(2);
        builder.setCambios(6);
        builder.setPuertas(3);
        builder.setMotor("Motor 2400");
        builder.setTipo("AutoDeLujo");
    }
}
