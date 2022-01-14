package com.github.patrones;

import com.github.patrones.abstractMethod.TransporteFactory;
import com.github.patrones.builder.*;
import com.github.patrones.factoryMethod.ITransporte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronesApplication.class, args);

/*        TransporteFactory tf = new TransporteFactory();
        Boolean maritimo = true;
        if (maritimo){
            tf.crearBarco();
        } else {
            tf.crearCamion();
        }*/

        Director director = new Director();
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific car.

        ConstructorAuto constructorAuto = new ConstructorAuto();
        ConstructorManualDeAuto constructorManual = new ConstructorManualDeAuto();
        director.construirAutoChico(constructorAuto);
        director.construirAutoChico(constructorManual);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.

        Auto auto = constructorAuto.getResult();
        System.out.println("Construimos el auto:\n" + auto.getTipo());

        Manual manual = constructorManual.getResult();
        System.out.println("Construimos el manual del auto:\n" + manual.getTipo());

        // Director may know several building recipes.
        director.construirAutoGrande(constructorManual);
        Manual carManualAutoGrande = constructorManual.getResult();
        System.out.println("\nCar Manual Auto Grande:\n" + carManualAutoGrande.toString());


    }

}
